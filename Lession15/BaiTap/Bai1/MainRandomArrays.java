package BaiTap.Bai1;


import java.util.Scanner;

public class MainRandomArrays {
    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.createRandom();

        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("\n" + "Moi nhap so ngau nhien: ");
            int n = sc.nextInt();
            try {
                System.out.println("Gia tri cua phan tu co chi so 5" + n + " la " + arr[n]);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Chi so vuot qua gioi han cua mang. Vui long nhap lai");
            }
        } while (true);
    }
}
