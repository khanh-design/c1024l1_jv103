import src.IChoice;
import src.NguoiDung;
import src.QuanlyNguoidung;
import src.User;
import src.exceptions.IndexInvalid;
import src.exceptions.IndexNotFound;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        List<NguoiDung<String, String>> users = new LinkedList<>();
        //Iterator1
        Iterator<NguoiDung<String, String>> it = users.iterator();
        while (it.hasNext()) {
            NguoiDung<String, String> user = it.next();
            System.out.println(user);
        }


        for (NguoiDung<String, String> u : users) {
            System.out.println(u);
        }
        QuanlyNguoidung userControl = new QuanlyNguoidung();
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("---------- User manager ---------------");
            System.out.println("1. Show list user");
            System.out.println("2. Add a new user");
            System.out.println("3. Delete a user");
            System.out.println("4. Search buy name");
            System.out.println("0.Exit");
            System.out.println("---------------------------------------");
            System.out.println("Enter choice: ");
            int choice = 0;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Vui long chon so");
                continue;
            } finally {
                System.out.println("luon luon chay ke ca co ngoai l hay khong");
            }

            if (choice == IChoice.EXIT) {
                break;
            }

            switch (choice) {
                case IChoice.SHOW_LIST:
                    userControl.showList();
                    break;
                case IChoice.ADD_CHOICE:
                    System.out.println("Enter user name: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter user age: ");
                    String age = scanner.nextLine();
                    NguoiDung<String, String> user = new NguoiDung<String, String>(name, age);
                    userControl.addUser(user);
                    break;
                case IChoice.DELETE_CHOICE:
                    System.out.println("Enter index user delete: ");
                    int index = Integer.parseInt(scanner.nextLine());
                    try {
                        userControl.removeUser(index);
                    } catch (IndexNotFound | IndexInvalid e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                    case IChoice.SEARCH_CHOICE:
                        System.out.println("Enter search user name: ");
                        String keyword = scanner.nextLine();
                        userControl.search(keyword);
                        break;
                default:
                    System.out.println("Invalid choice!");
            }
        }

        int[] arr = {1, 4, 5, 8, 10, 15, 20, 30, 40, 50, 60, 80, 100};
        boolean check = false;
        int x = 60;
        int count = 0;

        //Nhi phan
//        int leftIndex = 0;
//        int rightIndex = arr.length - 1;
//        while (leftIndex <= rightIndex) {
//            int midIndex = (leftIndex + rightIndex) / 2;
//            if (arr[midIndex] == x) {
//                check = true;
//                System.out.println("Da tim thay" + x + " tai vi tri " + midIndex);
//                break;
//            } else if (arr[midIndex] > x){
//                rightIndex = midIndex - 1;
//            } else {
//                leftIndex = midIndex + 1;
//            }
//        }
//
//        if (check == true) {
//            System.out.println("Khong tim thay");
//        }


        // tuyen tinh
        for (int i = 0; i <arr.length; i++) {
            if (arr[i] == x) {
                check = true;
                System.out.println("Da tim thay" + x + " tai vi tri " + i);
                break;
            }
            count++;
        }
        System.out.println("Sau " + count + " lan tim");

        if (check == false) {
            System.out.println("Khong tim thay");
        }

        // Cau lech don: O(1)
        int a = 10; // do phuc tao O(1)
        if (a > 10) {
            System.out.println("xin chao"); // do phuc tap 0(1)
        }

        // do phuc tap = tong = 3 x 0(1) -> n x 0(1) -> 0(1)

        // vong lap -> 0(n), 2 vong lap long nhau -> 0(n2) -> ap dung vong lap long nhau -> tang do phuc tap
    }
}
