package BaiTap.Bai1;

import java.util.Arrays;

public class MyList<E> {
    protected int size = 0;
    protected static final int DEFAULT_CAPACITY = 10;
    protected Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index " + i + " is out of bounds");
        }
        return (E) elements[i];
    }
}
