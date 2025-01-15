import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("-----Chương trình Quản lý User-----");
            System.out.println("1. Hiển thị danh sách User");
            System.out.println("2. Chỉnh sửa User");
            System.out.println("3. Xóa User");
            System.out.println("4. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("Danh sách người dùng:");
                    User u1 = new User(1, "khanh", "name", 20);
                    User u2 = new User(2, "Khoa", "name@gmail.com", 20);
                    User u3 = new User(4,"asad", "name@gmail.com", 19);
                    userManager.addUser(u1);
                    userManager.addUser(u2);
                    userManager.addUser(u3);
                    userManager.showListUsers();
                    break;

                case 2:
                    System.out.print("Nhập ID của người dùng cần chỉnh sửa: ");
                    int editId = Integer.parseInt(scanner.nextLine());
                    System.out.print("Nhập tên mới: ");
                    String newName = scanner.nextLine();
                    userManager.editUser(editId, newName);
                    userManager.showListUsers();
                    break;

                case 3:
                    System.out.print("Nhập ID của người dùng cần xóa: ");
                    int deleteId = Integer.parseInt(scanner.nextLine());
                    userManager.remoteUser(deleteId);
                    userManager.showListUsers();
                    break;

                case 4:
                    System.out.println("Thoát chương trình. Tạm biệt!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
            }
        }

    }
}