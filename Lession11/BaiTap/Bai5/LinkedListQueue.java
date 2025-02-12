package BaiTap.Bai5;

public class LinkedListQueue implements Solution{
    protected Node front;
    protected Node rear;

    public LinkedListQueue () {
        this.front = null;
        this.rear = null;
    }

    @Override
    public void enQueue(int data) {
        Node temp = new Node(data);
        if (this.rear == null) {
            this.front = this.rear = null;
            return;
        }
        this.rear.link = temp;
        this.rear = temp;
    }

    @Override
    public void deQueue() {
        if (this.front == null) {
            return;
        }
        Node tempNode = this.front;
        this.front = this.rear.link;
        if (this.front == null) {
            this.rear = null;
        }
        return;
    }

    @Override
    public void displayQueue() {
        LinkedListQueue queue = new LinkedListQueue();
        queue.enQueue(30);
        queue.enQueue(40);
        queue.enQueue(60);

        queue.deQueue();
        queue.deQueue();
        queue.deQueue();

        queue.enQueue(20);
        queue.enQueue(10);
    }

}
