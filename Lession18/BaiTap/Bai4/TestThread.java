package BaiTap.Bai4;

public class TestThread {
    public static void main(String[] args) {
        OddThread oddThread = new OddThread();
        EvenThread evenThread2 = new EvenThread();


        oddThread.start();

        try {
            oddThread.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        evenThread2.start();
    }
}
