package Circle_and_Cylinder;

public class Cylinder extends Circle{
    private double height;

    public Cylinder() {}

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public Cylinder(double height) {
        this.height = height;
    }
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return Math.PI * Math.pow(getRadius(), 2) * height;
    }

    public double getSurfaceArea() {
        return 2 * Math.PI * getRadius() * (getRadius() + height);
    }

    @Override
    public String toString() {
        return "A Cylinder with radius = " +
                getRadius() + ", color = " +
                color + ", height = " +
                height +
                " Volume is: " + getVolume() +
                " SurfaceArea is: " + getSurfaceArea() +
                ", which is a subclass of "
                + super.toString();
    }
}
