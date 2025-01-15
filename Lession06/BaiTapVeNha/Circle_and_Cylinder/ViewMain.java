package Circle_and_Cylinder;

public class ViewMain {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(5.8, "red");
        System.out.println(circle);

        System.out.println("---------Cylinder---------");
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(5.2, "pink", 3.4);
        System.out.println(cylinder);
    }
}
