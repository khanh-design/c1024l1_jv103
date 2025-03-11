package BaiTap.Bai4;

public class EvenThread extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                if (i % 2 == 0) {
                    System.out.println(Thread.currentThread().getName() + ": " + i);
                }
            }
            Thread.sleep(15);
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

    }
}
