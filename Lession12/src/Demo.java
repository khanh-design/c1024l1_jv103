package src;

import src.Entity.Product;
import src.Repository.ProductRepository;
import src.Service.impl.ProductSerive;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        ProductSerive productSerive = new ProductSerive();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("-----------Chuong trinh quan ly San Pham---------");
            System.out.println("1. Them san pham");
            System.out.println("2. Sua san pham theo id");
            System.out.println("3. Xoa san pham theo id");
            System.out.println("4. Hien thi san pham");
            System.out.println("5. Tim kiem san pham theo ten");
            System.out.println("6. Sap xep san pham tang dan, giam da theo gia");
            System.out.println("0. Exit");
            System.out.println("--------------------------------------------------");
            System.out.println("Moi nhap lua chon");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    Product product = intputProduct(scanner);
                    productSerive.Add(product);
                    break;
                case 2:
                    System.out.println("Nhap ID san pham can cap nhat: ");
                    int code = Integer.parseInt(scanner.nextLine());
                    ArrayList<Product> products = productSerive.SearchFindId(code);

                    if (products == null) {
                        System.out.println("Khong tim thay san pham voi ID: " + code);
                    } else {
                        System.out.println("Thong tin san pham hien tai: " + products);

                        System.out.println("Nhap ten: ");
                        String newName = scanner.nextLine();
                        System.out.println("Nhap gia moi: ");
                        double newPrice = Double.parseDouble(scanner.nextLine());
                        Product Updateproduct = new Product(code, newName, newPrice);
                        productSerive.Update(code);
                        System.out.println("Cap nhat thanh cong!!!");
                    }
                    break;
                case 3:
                    System.out.println("Nhap ma can xoa: ");
                    int RemoveId = Integer.parseInt(scanner.nextLine());
                    ArrayList<Product> product2 = productSerive.SearchFindId(RemoveId);
                    if (product2 == null) {
                        System.out.println("Khong tim thay id can xoa");
                    } else {
                        System.out.println("Thong tin can xoa" + product2);
                        System.out.println("Ban co muon xoa khong!!!!");
                        char confirm = scanner.nextLine().charAt(0);
                        if (confirm == 'c' || confirm == 'C') {
                            productSerive.Remove(RemoveId);
                            System.out.println("Xoa thanh cong!!!");
                        }
                    }
                    break;
                case 4:
                    ArrayList<Product> products3 = productSerive.getAll();
                    displayProducts(products3);
                    break;
                case 5:
                    System.out.println("Nhap ten can tim: ");
                    String searchName = scanner.nextLine();
                    ArrayList<Product> products4 = productSerive.SearchFindName(searchName);
                    displayProducts(products4);
                    break;
                case 6:
                    try {
                        System.out.println("Danh sach san pham duoc sap xep: ");
                        ArrayList<Product> products5 = new ArrayList<Product>();
//                        productSerive.Sort(products5.lastFirst().getPrice());
                    } catch (Exception e) {
                        System.out.println("Loi phuong thuc nay. Vi khong sap xep theo gia duoc: ");
                    }
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Moi nhap lai chuong trinh");
            }
        }
    }

    private static Product intputProduct(Scanner scanner) {
        System.out.println("Moi ban nhap ten san pham moi!!");
        System.out.println("Nhap id: ");
        int code = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap ten san pham: ");
        String name = scanner.nextLine();
        System.out.println("Nhap gia san pham: ");
        Double price = Double.parseDouble(scanner.nextLine());
        Product product = new Product(code, name, price);
        return product;
    }

    private static void displayProducts(ArrayList<Product> products) {
        System.out.println("--------------------------------");
        for (Product product : products) {
            System.out.println(product);
        }
        System.out.println("--------------------------------");
    }
}
