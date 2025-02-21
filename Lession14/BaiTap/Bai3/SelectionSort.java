package BaiTap.Bai3;

public class SelectionSort {
    static double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
    public static void selectionSort(double[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            double currentMin = list[i];
            int curentIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    curentIndex = j;
                }
            }

            if (curentIndex != i) {
                list[curentIndex] = arr[i];
                list[i] = currentMin;
            }
        }
    }

    public static void main(String[] args) {
        selectionSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
