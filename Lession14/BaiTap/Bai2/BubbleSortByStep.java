package BaiTap.Bai2;

import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + arr.length + " values:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Your input array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nBegin sort processing...");
        bubbleSort(arr);
    }

    public static void bubbleSort(int[] arr) {
        boolean NeedNextPass = true;
        for (int k = 0; k < arr.length && NeedNextPass; k++) {
            NeedNextPass = false;
            for (int i = 0; i < arr.length - k; i++) {
                System.out.println("Swap " + arr[i] + " with " + arr[i + 1]);
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;

                NeedNextPass = true;
            }
            if (NeedNextPass == false) {
                System.out.println("Array may be sorted and next pass not needed");
                break;
            }

            System.out.println("List after the " + k + " sort: ");
            for (int j = 0; j < arr.length; j++) {
                System.out.println(arr[j] + "\t");
            }
            System.out.println();
        }
    }
}
