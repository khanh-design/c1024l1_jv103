package BaiTap.Bai1;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (target < arr[mid]) {
                high = mid - 1;
            } else if (target == arr[mid]) {
                return mid;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        System.out.println(binarySearch(list, 2));
        System.out.println(binarySearch(list, 79));
        System.out.println(binarySearch(list, 50));
        System.out.println(binarySearch(list, 10));
        System.out.println(binarySearch(list, 66));
    }
}
