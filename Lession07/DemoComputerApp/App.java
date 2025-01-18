import src.*;


public class App {
    public static void main(String[] args) {
        Driver ssd = new DriverSDD("SDD 1024", 3000, "Nvidia");
        Driver shd = new DriverSHD("SHD 1024", 1024, "Nvidia");

        Manager mangager = new StudentManager();
        Manager manager2 = new DriverManager();
        System.out.println(manager2);


        // ap dung abstract class & interface
        // -> thiet ke so do lop: class diragram
        // -> trien khai theo thiet ke
    }
}
