package BaiTap.Bai6;

public interface IMyQueue {
    boolean isQueueFull();
    boolean isQueueEmpty();
    void enqueue(int item);
    void dequeue();
}
