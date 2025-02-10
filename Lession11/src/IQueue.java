package src;

public interface IQueue<T> {
    boolean offer(T item);
    T poll();
    T peek();
    T remove();
}
