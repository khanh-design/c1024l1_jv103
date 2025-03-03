import java.io.*;

public class Appuser {
    public static void main(String[] args) {
        File file = new File("E:\\Learned_Tai_FPT\\c1024l1_jv103\\Lession17\\src\\user.bin");
        try {
            //ghi du lieu
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
            User user = new User("John Doe", 25);
            User user1 = new User("Peter", 30);
            User user2 = new User("Switch", 30);
            oos.writeObject(user);
            oos.writeObject(user1);
            oos.writeObject(user2);
            oos.close();


            //doc object ra
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            User s1 = (User) ois.readObject();
            User s2 = (User) ois.readObject();
            User s3 = (User) ois.readObject();
            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s3);


        } catch (IOException e) {
            e.getMessage();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
