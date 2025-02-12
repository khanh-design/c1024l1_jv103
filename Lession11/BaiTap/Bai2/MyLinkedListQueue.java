package BaiTap.Bai2;

public class MyLinkedListQueue implements IMyLinkedListQueue {
    public Node head;
    public Node tail;

    public MyLinkedListQueue() {
        this.head = null;
        this.tail = null;
    }


    @Override
    public void enqueue(int key) {
        Node temp = new Node(key);
        if (this.head == null) {
            this.head = this.tail = temp;
            return;
        }
        this.tail.next = temp;
        this.tail = temp;
    }

    @Override
    public Node dequeue() {
        if (this.head == null) return null;
        Node temp = this.head;
        this.head = this.head.next;
        if (this.head == null) this.tail = null;
        return temp;
    }
}
