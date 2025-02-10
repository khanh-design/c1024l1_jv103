package src;

import java.util.Scanner;

public class DemoStack {
    public static void main(String[] args) {
        MyStack<Integer> myStack = new MyStack();

//        myStack.push(10);
//        myStack.push(20);
//        myStack.push(30);
//        myStack.pop();
//        System.out.println("Total elements: " + myStack.size());
//        System.out.println("Element peek: " + myStack.peek());
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number convert to Binary: ");
        int num = Integer.parseInt(sc.nextLine());
        while (num > 0) {
            int remainder = num % 2;
            myStack.push(remainder);
            num /= 2;
        }

        while (!myStack.isEmpty()) {
            System.out.println(myStack.pop());
        }
    }
}
