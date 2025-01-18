package src;

public class Student02 extends Student{
    public Student02(String name, String birthDate, String group) {
        super(name, birthDate, group);
    }

    @Override
    public double getFee() {
        return 10000;
    }
}
