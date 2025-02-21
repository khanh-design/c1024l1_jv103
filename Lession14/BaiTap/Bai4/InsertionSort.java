package BaiTap.Bai4;

public class InsertionSort {
    static int[] arr = {1, 6, 9, 10, 3, 28, 40, 30};
    public static void insertionSort(int[] arr) {
        int pos, x;
        for (int i = 0; i < arr.length; i++) {
            x = arr[i];
            pos = i;
            while (pos > 0 && arr[pos - 1] > x) {
                arr[pos] = arr[pos - 1];
                pos--;
            }
            arr[pos] = x;
        }
    }

    public static void main(String[] args) {
        insertionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
