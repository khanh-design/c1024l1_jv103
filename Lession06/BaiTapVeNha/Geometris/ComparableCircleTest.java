package Geometris;

import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle[] circle = new ComparableCircle[3];
        circle[0] = new ComparableCircle(3.6);
        circle[1] = new ComparableCircle();
        circle[2] = new ComparableCircle("indigo", false, 3.5);

        System.out.println("Pre-sorted:");
        for (ComparableCircle c : circle) {
            System.out.println(c);
        }

        Arrays.sort(circle);

        System.out.println("After-sorted:");
        for (ComparableCircle temp : circle) {
            System.out.println(temp);
        }
    }
}
