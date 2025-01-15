public class Square extends Rectangle{
    private String color;
    public Square(int size, String color) {
        super(size, size);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    //Nạp chồng phương thức
    public String getColor(String color) {
        return this.color + " " + color;
    }

//    @Override
//    public int getArea() {
//        return this.width * this.width * 2;
//    }


    @Override
    public String toString() {
        return "Square{" +
                "color='" + color + '\'' +
                ", width=" + width +
                '}';
    }
}
