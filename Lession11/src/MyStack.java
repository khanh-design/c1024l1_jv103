package src;

import java.util.ArrayList;
import java.util.List;

public class MyStack<T> implements IStack<T> {
    protected List<T> elements;

    public MyStack() {
        elements = new ArrayList<T>();
    }

    @Override
    public void push(T item) {
        elements.add(item);
    }

    @Override
    public T pop() {
        return elements.remove(elements.size() - 1);
    }

    @Override
    public T peek() {
        return elements.get(this.size() - 1);
    }

    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }

    @Override
    public int search(T item) {
        return 0;
    }

    @Override
    public int size() {
        return elements.size();
    }
}
