package BaiTap.Bai3;


public class MyList1Test {
    public static void main(String[] args) {
        MyList1<Integer> list = new MyList1<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("Size: " + list.size());
        System.out.println("Element at index 1: " + list.get(1));

        list.remove(1);
        System.out.println("Size after removal: " + list.size());

    }
}
