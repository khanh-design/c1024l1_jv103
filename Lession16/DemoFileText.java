import java.io.*;

public class DemoFileText {
    public static void main(String[] args) {

        File newFile = new File("E:\\c1024l1_jv103\\Lession16\\data.txt");
        //kiem tra file tong tai
//        System.out.println(newFile.canWrite());
//        System.out.println(newFile.canRead()); // doc file
//        System.out.println(newFile.getName()); // lay ten
//        System.out.println(newFile.getAbsolutePath()); // lay duong dan
//        System.out.println(newFile.getParent()); // lay duong dan tuyet doi

//        newFile.delete(); // xoa file
//        newFile.mkdir(); // tao thu muc


        // Ghi du lieu vao file
        try {
            FileWriter fileWriter = new FileWriter(newFile, true);

            //ghi: fileWrite vaf BuffedWriter

//            fileWriter.write("Hello World \n");
//            fileWriter.write("Hello World \n");
            fileWriter.write("Minh");

            fileWriter.close(); // dong luong ghi
        } catch (IOException e) {
            System.out.println("error writing to file: " + e.getMessage());
        }
    }

    public static void chenkFile(File file) throws FileNotFoundException {
        if (!file.exists()) {
            throw new FileNotFoundException("File " + file.getAbsoluteFile());
        }
    }
}
