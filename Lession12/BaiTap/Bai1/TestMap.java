package BaiTap.Bai1;

import java.util.*;

public class TestMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("---------Chuong trinh su dung hashMap, linkedHashMap, TreeMap--------");
            System.out.println("1. HashMap");
            System.out.println("2. LinkedHashMap");
            System.out.println("3. TreeMap");
            System.out.println("0. Exit");
            System.out.println("---------------------------------------------------------------------");
            System.out.println("Moi nhap lua chon: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    Map<String, Integer> hashMap = new HashMap<>();
                    hashMap.put("thuong", 30);
                    hashMap.put("huyen", 29);
                    hashMap.put("thuyen", 30);
                    hashMap.put("Hoang", 29);
                    System.out.println("Display entries in HashMap:");
                    System.out.println(hashMap + "\n");
                    break;
                case 2:
                    Map<String, Integer> treeMap = new TreeMap<>();
                    System.out.println("Display entries in ascending order of key:");
                    System.out.println(treeMap);
                    break;
                case 3:
                    Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
                    linkedHashMap.put("Smith", 30);
                    linkedHashMap.put("Anderson", 31);
                    linkedHashMap.put("Lewis", 29);
                    linkedHashMap.put("Cook", 29);
                    System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Lewis"));
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Moi nhap lai lua chon");
            }
        }

    }
}
