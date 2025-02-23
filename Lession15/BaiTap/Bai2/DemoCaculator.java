package BaiTap.Bai2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DemoCaculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CaculationExample example = new CaculationExample();
        double number1 = 0, number2 = 0;
        while (true) {
            try {
                System.out.println("Moi nhap phan tu thu 1: ");
                number1 = sc.nextDouble();
                System.out.println("Moi nhap phan tu thu 2: ");
                number2 = sc.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error parsing number. Vui long hap lai so");
                sc.nextLine();
            }
        }
        double result = example.caculation(number1, number2);
        System.out.println(result);
        sc.close();
    }
}
