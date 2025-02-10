package src;

public interface IStack<T> {
    void push(T item);
    T pop();
    T peek();
    boolean isEmpty();
    int search(T item);
    int size();
}
