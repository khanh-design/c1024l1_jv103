public class Main {
    public static void main(String[] args) {
        Rectangle[] list = new Rectangle[4];

        list[0] = new Square(3, "Blue");
        list[1] = new Square(5, "Red");
        list[2] = new Square(7, "Green");
        list[3] = new Rectangle(3, 4);

        for (Rectangle item : list) {
            //instanceof : La kiem tra neu ma
            if (item instanceof Square) {
                Square square = (Square) item;
                System.out.println(square.getColor());
            }
        }


        //Kiểu khai báo  || Kiểu thực tế
        Rectangle rectangle = new Square(10, "red");

        //ép tường minh
        Square square = (Square) rectangle;
        System.out.println(square.getColor());


        //double > int (ép tường minh)
        double x = 10;
        int y = (int) x;

        //int > double (ép ngầm định)
        int z = 10;
        double w = z;
    }
}