import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào đoạn văn bản:");
        String text = scanner.nextLine();
        scanner.close();

       
        Map<String, Integer> wordCountMap = new TreeMap<>();

        
        StringTokenizer tokenizer = new StringTokenizer(text, " .,;:!?()[]{}\"'");
        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken().toLowerCase();
            
            
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        
        System.out.println("Tần suất xuất hiện của từng từ:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
