package BaiTap.Bai2;

import java.io.*;
import java.nio.file.Files;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CopyFile {
    public static void Filecopy(File sourceFile, File targetFile) throws IOException {
        File source = new File("E:\\c1024l1_jv103\\Lession16\\BaiTap\\Bai2\\sourceFile.txt");
        File target = new File("E:\\c1024l1_jv103\\Lession16\\BaiTap\\Bai2\\targetFile.txt");

        /*
        * Buoc 1: Kiem tra file
        * Buoc 2: Tao thu muc
        * Buoc 3: Kiem tep target rong tai khong
        * Buoc 4: Sao chep tep
        * Buoc 5: Dem so ký tu trong tep nguon
        * */


        if (!source.exists()) {
            System.out.println("Error: source file '" + sourceFile + "' does not exist");
            return;
        }

        if (!target.exists()) {
            System.out.println("Error: target file '" + targetFile + "' does not exist");
            System.out.println("Do you want to copy it?(y/n): ");
            Scanner sc = new Scanner(System.in);
            String answer = sc.nextLine().trim().toLowerCase();
            if (!answer.equals("y")) {
                System.out.println("Progress copy exist.");
                sc.close();
                return;
            }
            sc.close();
        }


        try {
            FileInputStream fis = new FileInputStream(source);
            FileOutputStream fos = new FileOutputStream(target);
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
            System.out.println("Copy success!" + sourceFile + " to " + targetFile);
            fis.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(target));
            int charCount = 0;
            int c;
            while ((c = bufferedReader.read()) != -1) {
                charCount++;
            }
            System.out.println("Charcater in source file: " + charCount);
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the file source: ");
        String Source = scanner.nextLine();
        System.out.println("Enter the file target: ");
        String Target = scanner.nextLine();
        Filecopy(new File(Source), new File(Target));
        scanner.close();
    }
}
