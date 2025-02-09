package src;

import java.util.ArrayList;
import java.util.List;

public class USerControl<T> {
    protected List<T> list;

    public USerControl() {
        this.list = new ArrayList<T>();
    }

    public void addUser(T user) {
        list.add(user);
    }

    public void showList() {
        for (T user : list) {
            System.out.println(user);
        }
    }

    public void removeUser(int index) {
        this.list.remove(index);
    }

    public void search(String name) {
        // Chua nhung doi tuong khi search
        List<User> data = new ArrayList<>();
        for (User user : list) {
            if (user.get_name().equals(name)) {
                data.add(user);
            }
        }
        System.out.println("total user: " + data.size());
        for (User user : data) {
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
}
