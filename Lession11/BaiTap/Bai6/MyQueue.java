package BaiTap.Bai6;

import java.util.Queue;

public class MyQueue implements IMyQueue {
    private int capacity;
    private int[] queueArr;
    private int head;
    private int tail;
    private int currentSize;

    public MyQueue(int queueSize) {
        this.capacity = queueSize;
        queueArr = new int[this.capacity];
    }


    @Override
    public boolean isQueueFull() {
        boolean status = false;
        if (currentSize == capacity) {
            status = true;
        }
        return status;
    }

    @Override
    public boolean isQueueEmpty() {
        boolean status = false;
        if (currentSize == 0) {
            status = true;
        }
        return status;
    }

    @Override
    public void enqueue(int item) {
        if (isQueueEmpty()) {
            System.out.println("Overflow ! Unable to add element: "  + item);
        } else {
            tail = (tail + 1) % capacity;
            queueArr[tail] = item;
            currentSize++;
            System.out.println("Element: " + item + " is pushed to Queue !");
        }
    }


    @Override
    public void dequeue() {
        if (isQueueEmpty()) {
            System.out.println("Underflow ! Unable to remote element from Queue");
        } else {
            head++;
            if (head == capacity - 1) {
                System.out.println("Pop operation done ! removed:  " + queueArr[head - 1]);
                head = 0;
            } else {
                System.out.println("Pop operation done ! removed:  " + queueArr[head - 1]);
            }
            currentSize--;
        }
    }
}
