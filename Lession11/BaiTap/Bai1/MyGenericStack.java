package BaiTap.Bai1;

import src.MyStack;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<T> implements IMyGenericStack<T> {
    private LinkedList<T> stack;

    public MyGenericStack() {
        stack = new LinkedList<>();
    }


    @Override
    public void push(T element) {
        stack.addFirst(element);
    }

    @Override
    public T pop() {
        if (stack.isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    @Override
    public int size() {
        return stack.size();
    }

    @Override
    public boolean isEmpty() {
        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }



}
