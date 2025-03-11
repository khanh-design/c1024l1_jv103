package BaiTap.Bai3;

public class NumberGenerator implements Runnable{
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Printing the number " + i + ", HashCode: " + this.hashCode());
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread run is done");
    }

    public void start() {

    }
}
