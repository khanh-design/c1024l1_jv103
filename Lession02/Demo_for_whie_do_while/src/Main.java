import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //su dung vong lap for
        // thuong su dung khi cac biet so lan lap
        //Vd: in ra cac so tu 1 - 10

        //While -> truong hop khong biet truoc so lan lap
        // vi du: in ra cac so chan den khi so luong so chan in ra  = 20
        // in ra 20 so chan dau tien
        // khi nap nhap D thi exit chuong trinh
        Scanner sc = new Scanner(System.in);

//        while (true) {
//            System.out.println("1. ");
//            System.out.println("2. ");
//            System.out.println("0. Exit");
//            int n = Integer.parseInt(sc.nextLine());
//            if (n == 0) {
//                break;
//            }
//        }


        //Do-While -> bat buoc phai thuc hien it nhat 1 lan sau do moi lap lai cv do
        int x = 0;
        int sum = 0;
        do {
            System.out.println("Enter x: ");
            x = Integer.parseInt(sc.nextLine());
            sum += x;
        } while (x < 10);
        System.out.println("Sum: " + sum);
    }
}