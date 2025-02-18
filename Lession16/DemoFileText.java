import java.io.File;

public class DemoFileText {
    public static void main(String[] args) {
        File newFile = new File("data.txt");


    }

    public static void chenkFile(File file) {
        if (!file.exists()) {
            throw new IllegalStateException("erorr");
        }
    }
}
