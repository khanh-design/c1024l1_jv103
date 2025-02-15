package BaiTap.Bai2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StudentTest {
    public static void main(String[] args) {
        Students s1 = new Students("Nam", 20, "HN");
        Students s2 = new Students("Phuong", 19, "HY");
        Students s3 = new Students("Hoang", 20, "HD");

        Map<Integer, Students> studentsMap = new HashMap<Integer, Students>();
        studentsMap.put(1, s1);
        studentsMap.put(2, s2);
        studentsMap.put(3, s3);
        studentsMap.put(4, s1);

        for (Map.Entry<Integer, Students> entry : studentsMap.entrySet()) {
            System.out.println(studentsMap.toString());
        }

        System.out.println("---------Set");
        Set<Students> studentsSet = new HashSet<Students>();
        studentsSet.add(s1);
        studentsSet.add(s2);
        studentsSet.add(s3);
        studentsSet.add(s1);

        for (Students students : studentsSet) {
            System.out.println(students.toString());
        }
    }
}
