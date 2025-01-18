package src;

public class Student01 extends Student implements IStudent{
    public Student01(String name, String birthDate, String group) {
        super(name, birthDate, group);
    }

    @Override
    public double getFee() {
        return 5000;
    }

    @Override
    public String getStudent(Student student) {
        return "";
    }
}
