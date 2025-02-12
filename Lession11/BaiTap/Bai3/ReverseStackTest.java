package BaiTap.Bai3;

import java.util.Stack;

public class ReverseStackTest {
    public static void main(String[] args) {
        String inputString = "Hello World";

        Stack<String> stack = new Stack<>();

        String[] word = inputString.split(" ");
        for (int i = 0; i < word.length; i++) {
            stack.push(word[i]);
        }

        for (int i = 0; i < word.length; i++) {
            System.out.print(stack.pop() + " ");
        }

        StringBuilder outputString = new StringBuilder();
        while (!stack.isEmpty()) {
            outputString.append(stack.pop()).append(" ");
        }
        System.out.println(outputString.toString());
    }
}
