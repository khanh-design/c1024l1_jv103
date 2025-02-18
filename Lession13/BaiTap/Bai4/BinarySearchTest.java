package BaiTap.Bai4;

import java.util.Scanner;

public class BinarySearchTest {
    private static int BinarySearch(int[] arr, int left, int right, int value) {
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == value) {
                return mid;
            } else if (arr[mid] < value) {
                left = mid - 1;
            } else {
                right = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi nhap so luong phan tu cua mang: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhap cac phan tu cua mang: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Phan tu thu " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        int result = BinarySearch(arr, 0, 10, 4);
        if (result == -1) {
            System.out.println("Khong tim thay gia tri can tim");
        } else {
            System.out.println("Gia tri can tim xuat hien tai vi tri thu " + (result + 1));
        }
    }
}
