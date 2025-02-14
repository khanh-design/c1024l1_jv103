package BaiTap.Bai7;

public interface IMyStack {
    void push(int element);
    int pop() throws Exception;
    int side();
    boolean isEmpty();
    boolean isFull();
}
