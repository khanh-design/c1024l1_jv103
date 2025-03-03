package Bai2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Appstudent {
    public static void writeDataToFile(String path, List<Student> students) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static List<Student> readDataFromFile(String path) {
        List<Student> students = new ArrayList<Student>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<Student>) ois.readObject();
            ois.close();
            fis.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return students;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Student> students =new ArrayList<>();
        students.add(new Student(1, "Vu kieu anh", "Ha Noi"));
        students.add(new Student(2, "Phuong linh", "Da Nang"));
        students.add(new Student(3, "Van hai", "Hai Phong"));
        students.add(new Student(4, "Nguyen Khanh Tung", "Ha Noi"));
        students.add(new Student(5, "Nguyen Khac Nhat", "Ha Noi"));
        writeDataToFile("E:\\Learned_Tai_FPT\\c1024l1_jv103\\Lession17\\BaiTap\\Bai2\\student.txt", students);

        List<Student> studentDataFromFile  = new ArrayList<Student>();
        for (Student student : studentDataFromFile) {
            System.out.println(student);
        }
    }
}
