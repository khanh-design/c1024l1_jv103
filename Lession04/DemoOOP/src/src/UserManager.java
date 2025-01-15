import java.util.Scanner;

public class UserManager {
    private User[] list;
    private int limit;

    public UserManager(int limit) {
        list = new User[0];
        this.limit = limit;
    }

    public UserManager() {
        list = new User[0];
        this.limit = 10;
    }

    public void addUser(User user) {
        int totalCapacityCurrentUser = list.length;

        if (totalCapacityCurrentUser == limit) {
            System.out.println("full capacity");
        } else {
            User[] newlist = new User[totalCapacityCurrentUser + 1];
            for (int i = 0; i < totalCapacityCurrentUser; i++) {
                newlist[i] = list[i];
            }

            newlist[totalCapacityCurrentUser] = user;
            list = newlist;
        }

    }

    public void showListUsers() {
        for (User u : list) {
            System.out.println(u.getinfo());
        }
    }

    public void remoteUser(int id) {
        int index = -1;
        for (int i = 0; i < list.length; i++) {
            if (list[i].getId() == id) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Khong tim thay nguoi dung ID: " + id);
        } else {
            User[] newList = new User[list.length - 1];
            for (int i = 0; i < index; i++) {
                newList[i] = list[i];
            }
            for (int i = index + 1; i < list.length; i++) {
                newList[i - 1] = list[i];
            }
            list = newList;
            System.out.println("Xoa thanh cong Id: " + id);
        }
    }

    public void editUser(int id, String name) {
        int found = -1;
        for (User user : list) {
            if (user.getId() == id) {
                user.setName(name);
                found = 1;
                break;
            }
        }
        if (found == -1) {
            System.out.println("Khong tim thay nguoi dung ID: " + id);
        } else {
            System.out.println("Cap nhat ten thanh cong ID: " + id);
        }
    }
}
