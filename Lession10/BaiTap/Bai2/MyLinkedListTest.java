package BaiTap.Bai2;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList test = new MyLinkedList(10);
        test.addFirst(11);
        test.addFirst(12);
        test.addFirst(13);

        test.add(4, 9);
        test.add(4, 9);
        test.printList();
    }
}
