package Point2D_and_Point3D;

public class ViewMain {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(3.0f, 4.0f);
        System.out.println("Point2D: " + point2D);

        float[] points = point2D.getXY();
        System.out.println("getXY(): [" + points[0] + "," + points[1] + "]");



        Point3D point3D = new Point3D(3, 4, 5);
        System.out.println("Point 3D: (" + point3D.getX() + ", " + point3D.getY() + ", " + point3D.getZ() + ")");
        float[] xyz = point3D.getXYZ();
        System.out.println("getXYZ(): [" + xyz[0] + ", " + xyz[1] + ", " + xyz[2] + "]");
    }
}
