package BaiTap.Bai4;

public class App {
    public static void main(String[] args) {
        MyLinkedList1 myList = new MyLinkedList1();
        Node n1 = new Node(10);
        myList.addFirstNode(n1);
        Node n2 = new Node(20);
        myList.addFirstNode(n2);
        Node n3 = new Node(30);
        myList.addFirstNode(n3);
        Node n4 = new Node(50);
        myList.addLastNode(n4);
        Node n5 = new Node(80);
        myList.addFirstNode(n5);
        myList.removeFirstNode(n5);
        System.out.println(myList.getFirstNode().getData());
        System.out.println(myList.getLastNode().getData());
        System.out.println("Size: " + myList.size());
    }
}
