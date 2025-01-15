public class Main {
    public static void main(String[] args) {
//        int[] number = {1,2,3,4,5}; // mang lac danh
        /*
            - ten mang: numbers
            - kieu du lieu phan tu trong mang: int
            - so phan tu mang: 5 = so dai
        * */

        int[] arr = new int[5];
        /*
            - ten mang: arr
            - kieu du lieu phan tu trong mang: int
            - so phan tu mang co the chua = 5(kich thuoc mang)
            - cac phan tu trong mang hien tai nhan gia tri mac dinh cua kieu du lieu
        * */

//      add item
        arr[0] = 2;
        arr[1] = 3;
        arr[2] = 4;
        arr[3] = 5;
        arr[4] = 11;


        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

//        heap - chua object & function, String pool
//        stack - bien nguyen thuy, ten ham
//        mang 2 chieu(n chieu): la mang 1 chieu chua cac phan tu. la 1 chieu khac

        int[][] arr2 = new int[4][6];

        /*
            - ten mang: arr2
            - kieu du lieu phan tu trong mang: int
            - loai mang: 2 chieu
            - so phan tu mang arr2: 4
            - so phan tu cua mot phan tu trong mang: 6
        * */
        arr2[3][6] = 8;

        int x = 10;
        int y = 20;
        int total = sum(x, y);
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    /*
        - ten ham: sum
        - kieu du lieu tra ve: int
        - tham so dau vao: a, b (kieu int)
        - tac dung: tinh tong 2 so a va b
        g(x) = x^2 + x + 1;
        - g ten ham
        - x^2+x+1: bieu thuc ham - tham ham - gia tri cua ham
        - x: tham so dau vao cua ham
        - goi ham: g(3) = 13
                   g(4) = 21
                   g(5) = 31
                   => Tai su dung lai ma nguon ma khong lam ton qua nhieu bo nho.

        - Ham:
    * */

    public static int sum2(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count += arr[i];
        }
        return count;
    }

    int[] arr = new int[] {};
}