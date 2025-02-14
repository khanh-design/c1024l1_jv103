package BaiTap.Bai7;

public class MyStackTest {
    static MyStack stack = new MyStack(5);
    public static void main(String[] args) {
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("1. Size of stack after push operations: " + stack.side());
        System.out.println("2. Pop elements from stack: ");

        try {
            while (!stack.isEmpty()) {
                System.out.printf(" %d", stack.pop());
            }
        } catch (Exception e){
            System.out.println("Error");
        }

        System.out.println("\n3. Size of stack after pop operations: " + stack.side());

    }
}
