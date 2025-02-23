package BaiTap.Bai2;

import java.util.Scanner;

public class CaculationExample {
    public double caculation(double x, double y) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Caculation: {+, -, *, /}");
        char operation = sc.next().charAt(0);
        switch (operation) {
            case '+':
                System.out.printf(x + " + " + y + " = ");
                return x + y;
            case '-':
                System.out.printf(x + " - " + y + " = ");
                return x - y;
            case '*':
                System.out.printf(x + " * " + y + " = ");
                return x * y;
            case '/':
                if (y == 0) {
                    System.out.println("Can`t divide by zero");
                } else {
                    System.out.printf(x + " / " + y + " = ");
                    return (double) x / y;
                }
            default:
                System.out.println("Invalid operation");
        }
        return 0;
    }
}
