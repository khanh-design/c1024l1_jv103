package Geometris;

public class ViewMain {
    public static void main(String[] args) {
        //Class Shape
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("Blue", false);
        System.out.println(shape);


        //Class Circle
        System.out.println("---------Circle---------");
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle("Red", true, 2.5);
        System.out.println(circle);


        //Class Rectangle
        System.out.println("-----------Rectangle-----------");
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(4, 5);
        System.out.println(rectangle);

        rectangle = new Rectangle("Green", false, 3, 4);
        System.out.println(rectangle);

        //Class Square
        System.out.println("------------Square-------------");
        Square square = new Square();
        System.out.println(square);

        square = new Square(5.8);
        System.out.println(square);

        square = new Square(5.8, "Yellow", false);
        System.out.println(square);
    }
}
