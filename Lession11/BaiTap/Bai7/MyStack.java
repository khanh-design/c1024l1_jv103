package BaiTap.Bai7;

public class MyStack implements IMyStack {
    private int[] arr;
    private int size;
    private int index;

    public MyStack(int size) {
        this.size = size;
        arr = new int[size];
    }


    @Override
    public void push(int element) {
        if (isFull()) {
            throw new StackOverflowError("Stack is full");
        }
        arr[index++] = element;
    }

    @Override
    public int pop() throws Exception{
        if (isEmpty()) {
            throw new Exception("Stack is empty");
        }
        return arr[index--];
    }

    @Override
    public int side() {
        return  index;
    }

    @Override
    public boolean isEmpty() {
        if (index == 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isFull() {
        if (index == size) {
            return true;
        }
        return false;
    }
}
