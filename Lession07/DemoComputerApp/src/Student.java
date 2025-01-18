package src;

public abstract class Student {
    private String name;
    private String birthDate;
    private String group;

    public Student(String name, String birthDate, String group) {
        this.name = name;
        this.birthDate = birthDate;
        this.group = group;
    }

    public abstract double getFee();
}
