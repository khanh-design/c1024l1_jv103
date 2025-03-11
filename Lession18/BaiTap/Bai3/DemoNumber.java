package BaiTap.Bai3;

public class DemoNumber {
    public static void main(String[] args) {
        NumberGenerator numberGenerator = new NumberGenerator();
        NumberGenerator numberGenerator2 = new NumberGenerator();
        NumberGenerator numberGenerator3 = new NumberGenerator();

        Thread thread1 = new Thread(numberGenerator);
        Thread thread2 = new Thread(numberGenerator2);
        Thread thread3 = new Thread(numberGenerator3);

        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.MAX_PRIORITY);
        thread3.start();
    }
}
