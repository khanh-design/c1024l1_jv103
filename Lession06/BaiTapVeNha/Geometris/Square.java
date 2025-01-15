package Geometris;

public class Square extends Rectangle{
    protected double side = 1.0;

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    public Square(double side, String yellow, boolean b) {
        super(side, side);
        this.side = side;
    }

    public Square(){}

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return "A Shape with side "
                + side
                + ", which is a subclass of "
                + super.toString();
    }
}
