package BaiTap.Bai1;

public interface IMyGenericStack<T> {
    void push(T element);
    T pop();
    int size();
    boolean isEmpty();
}
