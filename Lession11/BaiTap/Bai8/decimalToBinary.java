package BaiTap.Bai8;

import java.util.Scanner;
import java.util.Stack;

public class decimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("----------- Chuong trinh chuyen doi thap Hexa-----------");
            System.out.println("1. Doi thap sang nhi");
            System.out.println("2. Doi nhi sang Hexa");
            System.out.println("0. Exit");
            System.out.println("---------------------------------------------------------");
            System.out.println("Moi nhap lua chon: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    DecimalToBinary(sc);
                    break;
                case 2:
                    System.out.println("Moi nhap nhi phan can chuyen:");
                    String binary = sc.nextLine();
                    int num = binaryToDecimal(binary);
                    String hex = HexaToBinary(num);
                    System.out.println("Binary to Hexa: " + hex);
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Loi moi nhap lai truong trinh");
            }
        }
    }

    private static int binaryToDecimal(String binary) {
        int decimal = 0;
        int power = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {
            int bit = binary.charAt(i) - '0';
            decimal += bit * Math.pow(2, power++);
        }
        return decimal;
    }

    private static String HexaToBinary(int decimal) {
        Stack<Character> stack = new Stack<>();
        while (decimal > 0) {
            int remainder = decimal % 16;
            if (remainder < 10) {
                stack.push((char) ('0' + remainder));
            } else {
                stack.push((char) ('A' + (remainder - 10)));
            }
            decimal /= 16;
        }

        StringBuffer hex = new StringBuffer();
        while (!stack.isEmpty()) {
            hex.append(stack.pop());
        }

        return hex.toString();
    }


    private static void DecimalToBinary(Scanner scanner) {
        Stack<Integer> stack = new Stack<>();
        System.out.println("Moi nhap phan tu ban muon quy doi: ");
        int number = Integer.parseInt(scanner.nextLine());

        while (number > 0) {
            int remader =  number % 2;
            number = number / 2;
            stack.push(remader);
        }

        while (!stack.isEmpty()) {

            System.out.println(stack.pop() + " ");
        }
    }
}
