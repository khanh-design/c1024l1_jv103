package src;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MyQueue<T> implements IQueue<T> {
    protected List<T> elements;

    public MyQueue() {
        elements = new LinkedList<T>();
    }

    @Override
    public boolean offer(T item) {
        elements.add(item);
        return true;
    }

    @Override
    public T poll() {
        if (elements.isEmpty()) {
            return null;
        }
        return elements.get(0);
    }

    @Override
    public T peek() {
        return null;
    }

    @Override
    public T remove() {
        return elements.remove(0);
    }

}
