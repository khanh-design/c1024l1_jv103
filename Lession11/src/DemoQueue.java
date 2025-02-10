package src;

public class DemoQueue {
    public static void main(String[] args) {
        MyQueue<Integer> myQueue = new MyQueue();
        myQueue.offer(1);
        myQueue.offer(2);
        myQueue.offer(3);
        myQueue.offer(10);

        myQueue.remove();
        myQueue.remove();

        System.out.println(myQueue.poll());
    }
}
