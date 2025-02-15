package BaiTap.Bai2;

public class Students {
    private String name;
    private int age;
    private String diaChi;

    public Students(String name, int age, String diaChi) {
        this.name = name;
        this.age = age;
        this.diaChi = diaChi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
}
