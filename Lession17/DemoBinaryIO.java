import java.io.*;

public class DemoBinaryIO {
    /*
    * Ghi dữ liệu:
    * FileOutputStream: Dùng để kết nối đến file cần ghi dữ liệu vào file bin
    *  - writeInt(): ghi số
    *  - writeUTF(): ghi dạng chuỗi
    * e: là đối tượng được truyền vào dung để xử lý ngoại lệ.
    * */

    /*
    * Đọc dữ liệu:
    * FileInputStream: Dùng để kết nối đến file cần đọc dữ liệu.
    *   - readInt(): đọc dạng số
    *   - readUTF(): đọc dạng chuỗi.
    * */
    public static void main(String[] args) {
        File file = new File("E:\\Learned_Tai_FPT\\c1024l1_jv103\\Lession17\\src\\data.bin");
        try {
            //ghi dữ liệu
            FileOutputStream fos = new FileOutputStream(file);
            DataOutputStream dataOutputStream = new DataOutputStream(fos);
            dataOutputStream.writeUTF("hello world");
            dataOutputStream.writeInt(11);
            dataOutputStream.writeUTF("world");
            dataOutputStream.writeInt(100);
            dataOutputStream.close();

            //doc file
            FileInputStream fis = new FileInputStream(file);
            DataInputStream dataInputStream = new DataInputStream(fis);
            String content = dataInputStream.readUTF();
            int content2 = dataInputStream.readInt();
            int content3 = dataInputStream.readInt();
            System.out.println("Noi dung file: " + content + " content2: " + content2 + " content3: " + content3);
            dataInputStream.close();
        } catch(FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
