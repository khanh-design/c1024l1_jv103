package Bai3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App_san_pham {
    private static final String DATA_FILE = "E:\\Learned_Tai_FPT\\c1024l1_jv103\\Lession17\\BaiTap\\Bai3\\sanpham.bin";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            try {
                System.out.println("-------------Quan ly san pham-------------");
                System.out.println("1. Them san pham");
                System.out.println("2. Hien thi san pham");
                System.out.println("3. Tim kiem san pham");
                System.out.println("0. Exit");
                System.out.println("------------------------------------------");
                System.out.println("Nhap lua chon: ");
                int choice = Integer.parseInt(scanner.nextLine());

                List<Sanpham> sanphamList = new ArrayList<>();
                switch (choice) {
                    case 1:
                        System.out.println("Nhap so san pham can them: ");
                        int code = Integer.parseInt(scanner.nextLine());
                        System.out.println("Nhap ten san pham can them: ");
                        String name = scanner.nextLine();
                        System.out.println("Nhap gia san pham: ");
                        double price = Double.parseDouble(scanner.nextLine());
                        System.out.println("Nhap nha san xuat san pham: ");
                        String manufacturer = scanner.nextLine();
                        System.out.println("Nhap mo ta san pham: ");
                        String description = scanner.nextLine();

                        Sanpham sanpham = new Sanpham(code, name, price, manufacturer, description);
                        sanphamList.add(sanpham);
                        writeDataToFile(DATA_FILE, sanphamList);
                        break;
                    case 2:
                        sanphamList = readDataFromFile(DATA_FILE);
                        for (Sanpham item : sanphamList) {
                            System.out.println(item);
                        }
                        break;
                    case 3:
                        System.out.println("Nhap ma san pham can tim kiem: ");
                        int searchCode = Integer.parseInt(scanner.nextLine());
                        sanphamList = readDataFromFile(DATA_FILE);
                        for (Sanpham item : sanphamList) {
                            if (item.getId() == searchCode) {
                                System.out.println(item);
                                break;
                            }
                        }
                        break;
                    case 0:
                        return;
                    default:
                        System.out.println("Lua chon khong hop le!");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Loi nhap lua chon" + e.getMessage());
            }
        }
    }

    private static void writeDataToFile(String path, List<Sanpham> sanphamList) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(sanphamList);
            oos.close();
            System.out.println("Luu du lieu thanh cong!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static List<Sanpham> readDataFromFile(String path) {
        List<Sanpham> sanphamList = new ArrayList<Sanpham>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            sanphamList = (List<Sanpham>) ois.readObject();

            ois.close();
            fis.close();
        } catch (ClassNotFoundException | IOException e) {
            System.out.println(e.getMessage());
        }
        return sanphamList;
    }
}
