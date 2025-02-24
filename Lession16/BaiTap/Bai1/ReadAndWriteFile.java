package BaiTap.Bai1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<Integer> readFile(String filePath) {
        List<Integer> number = new ArrayList<>();
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                number.add(Integer.parseInt(line));
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("File khong ton tai or noi dung bi loi");
        } catch (IOException e) {
            System.out.println("noi dung bi loi");
        }
        return number;
    }

    public void writeFile(String filePath, int max) {
        try {
            FileWriter writer = new FileWriter(filePath, true);
            BufferedWriter bw = new BufferedWriter(writer);
            bw.write("Gia tri lon nhat la: " + max + "\n");
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int findMax(List<Integer> number) {
        int max = number.get(0);
        for (int i = 1; i < number.size(); i++) {
            if (number.get(i) > max) {
                max = number.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile rw = new ReadAndWriteFile();
        List<Integer> number = rw.readFile("E:\\c1024l1_jv103\\Lession16\\BaiTap\\numbers.txt");
        int maxValue = findMax(number);
        rw.writeFile("E:\\c1024l1_jv103\\Lession16\\BaiTap\\result.txt", maxValue);

    }
}
