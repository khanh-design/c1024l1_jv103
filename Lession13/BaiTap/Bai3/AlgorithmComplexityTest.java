package BaiTap.Bai3;

import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        int[] frequentChar = new int[255];      //{1}
        for (int i = 0; i < input.length(); i++) {  //{2} -> O(n)
            int asci = (int) input.charAt(i);   //{3}
            frequentChar[asci]++;   //{4}
        }
        // tong do phuc tap: 0(1) + 0(n.1.1) -> 0(n)

        int max = 0;    //{5}
        char character = (char) 255;    //{6}
        for (int j = 0; j < 255; j++) { //{7} -> 0(255)
            if (frequentChar[j] > max) { //{8} -> 0(1)
                max = frequentChar[j];  //{9}
                character = (char) j;   //{10}
            }
        }

        // tong do phuc tap: 0(1) + 0(255.1.1.1) -> 0(255).
        System.out.println("The most appearing letter is '" + character + "' with a frequency of " + max + " times");
    }
}
