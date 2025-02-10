package BaiTap.Bai1;

public class GenericStackClient {
    private static void stackOfStrings() {
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");

        System.out.println("1.1 Size of stack after push operation: " + stack.size());
        System.out.println("1.2 Pop element: ");
        while (!stack.isEmpty()) {
            System.out.println(" %s"+ stack.pop());
        }
        System.out.println("\n1.3. Size of stack after pop operation: " + stack.size());
    }

    private static void stackOfIntegers() {
        MyGenericStack<Integer> stack1 = new MyGenericStack<>();
        stack1.push(5);
        stack1.push(4);
        stack1.push(3);
        stack1.push(2);
        stack1.push(1);
        System.out.println("1.2 Size of stack after push operation: " + stack1.size());
        System.out.println("2.2 Pop element form stack : ");
        while (!stack1.isEmpty()) {
            System.out.println("% d" + stack1.pop());
        }
        System.out.println("\n1.3. Size of stack after pop operation: " + stack1.size());
    }
    public static void main(String[] args) {
        System.out.println("1. Stak of integer");
        stackOfIntegers();
        System.out.println("\n2. Stack of Strings");
        stackOfStrings();
    }
}
