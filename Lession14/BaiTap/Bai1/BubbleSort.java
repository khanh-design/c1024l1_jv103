package BaiTap.Bai1;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        boolean needNextPass = true;

        for (int k = 1; k < arr.length && needNextPass; k++) {
            needNextPass = false;
            for (int i = 0; i < arr.length - k; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;


                    needNextPass = true;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 90, 7, 9, 10, 25, 45, 70, 20, 50};
        bubbleSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
