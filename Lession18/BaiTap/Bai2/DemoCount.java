package BaiTap.Bai2;

public class DemoCount {
    public static void main(String[] args) {
        Count count = new Count();
        try {
            while (count.getMyThread().isAlive()) {
                System.out.println("Main thread will be alvie till the child thread is live");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thrad interrupted");
        }
        System.out.println("Main thread run is done");
    }
}
