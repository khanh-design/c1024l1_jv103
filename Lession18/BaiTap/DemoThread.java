package BaiTap;

public class DemoThread {
    public static void main(String[] args) {
        System.out.println("Main thread running...");

        RunnableDemo runnableDemo = new RunnableDemo("Thread-1-HR-Database");
        runnableDemo.start();

        RunnableDemo demo = new RunnableDemo("thread-2-2Send-Email");
        demo.start();

        System.out.println("Main thread stopped!!!");
    }
}
