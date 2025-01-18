package src;

public class Student03 extends Student{
    public Student03(String name, String birthDate, String group) {
        super(name, birthDate, group);
    }
    @Override
    public double getFee() {
        return 15000;
    }
}
