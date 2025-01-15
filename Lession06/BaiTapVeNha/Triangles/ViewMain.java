package Triangles;

import java.util.Scanner;

public class ViewMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi nguoi dung nhap vao canh side1: ");
        double canh1 = scanner.nextDouble();
        System.out.println("Moi nguoi dung nhap vao canh side2: ");
        double canh2 = scanner.nextDouble();
        System.out.println("Moi nguoi dung nhap vao canh side3: ");
        double canh3 = scanner.nextDouble();

        System.out.println("Moi nhap mau cua tam giac: ");
        String mau = scanner.next();

        Triangle triangle = new Triangle(canh1, canh2, canh3, mau, false);

        System.out.println("---------------Tam Giac-----------------");
        System.out.println("Color: " + triangle.getColor());
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());

        scanner.close();
    }
}
