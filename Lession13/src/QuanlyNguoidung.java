package src;

import src.exceptions.IndexInvalid;
import src.exceptions.IndexNotFound;

import java.util.ArrayList;
import java.util.List;

public class QuanlyNguoidung {
    protected List<NguoiDung<String, String>> list;

    public QuanlyNguoidung() {
        this.list = new ArrayList<>();
        list.add(new NguoiDung<String, String>("Nam", "20", "06/10/2000"));
        list.add(new NguoiDung<String, String>("Quan", "19", "06/10/2012"));
        list.add(new NguoiDung<String, String>("Hoang", "30", "06/10/1998"));
    }

    public void addUser(NguoiDung<String, String> user) {
        list.add(user);
    }

    public void showList() {
        for (NguoiDung<String, String> user : list) {
            System.out.println(user);
        }
    }

    public void removeUser(int index) throws IndexNotFound, IndexInvalid {
        if (index < 0) {
            throw new IndexInvalid("index must be greater than 0");
        }
        if (index > list.size() - 1) {
            throw new IndexNotFound("Index not Found");
        }
        this.list.remove(index);
    }

    public void search(String name) {
        // Chua nhung doi tuong khi search
        List<NguoiDung<String, String>> data = new ArrayList<>();
        for (NguoiDung<String, String> user : list) {
//            if (user.get_name().equals(name)) {
//                data.add(user);
//            }
        }
        System.out.println("total user: " + list.size());
        for (NguoiDung<String, String> user : list) {
            list.remove(user); // phai xoa theo object
            System.out.println(user);
        }
//        if (type == 1) {
//            /*
//             search by name
//             TODO : implement is by name
//            */
//        } else {
//            //search by age
//        }
//        for (User user : list) {
//
//        }
    }

    public List<NguoiDung<String, String>> searchByName(String name) {
        List<NguoiDung<String, String>> data = new ArrayList<>();
        for (NguoiDung<String, String> item : list) {
            if (item.get_name().equals(name)) {
                data.add(item);
            }
        }

        System.out.println("Tim duoc " + data.size() + " nguoi dung co ten" + name);
        for (NguoiDung<String, String> item : data) {
            System.out.println(item);
        }
        return data;
    }
}
