import src.ChoiceConstant;
import src.Person;
import src.USerControl;
import src.User;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        List<User> users = new LinkedList<>();
//        User u1 = new User("An", 20);
//        User u2 = new User("Phuong", 15);
//        User u3 = new User("Khanh", 23);
//        users.add(u1);
//        users.add(u2);
//        users.add(u3);
//
//        //Iterator
//        Iterator<User> it = users.iterator();
//        while (it.hasNext()) {
//            User user = it.next();
//            System.out.println(user);
//        }
//
//
//        for (User u : users) {
//            System.out.println(u);
//        }
//        USerControl<User> userControl = new USerControl<User>();
//        while (true) {
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("---------- User manager ---------------");
//            System.out.println("1. Show list user");
//            System.out.println("2. Add a new user");
//            System.out.println("3. Delete a user");
//            System.out.println("4. Search buy name");
//            System.out.println("0.Exit");
//            System.out.println("---------------------------------------");
//            System.out.println("Enter choice: ");
//            int choice = Integer.parseInt(scanner.nextLine());
//            if (choice == ChoiceConstant.EXIT) {
//                break;
//            }
//
//            switch (choice) {
//                case ChoiceConstant.SHOW_LIST:
//                    userControl.showList();
//                    break;
//                case ChoiceConstant.ADD_CHOICE:
//                    System.out.println("Enter user name: ");
//                    String name = scanner.nextLine();
//                    System.out.println("Enter user age: ");
//                    int age = Integer.parseInt(scanner.nextLine());
//                    User user = new User(name, age);
//                    userControl.addUser(user);
//                    break;
//                case ChoiceConstant.DELETE_CHOICE:
//                    System.out.println("Enter index user delete: ");
//                    int index = Integer.parseInt(scanner.nextLine());
//                    userControl.removeUser(index);
//                    break;
//                    case ChoiceConstant.SEARCH_CHOICE:
//                        System.out.println("Enter search user name: ");
//                        String keyword = scanner.nextLine();
//                        userControl.search(keyword);
//                        break;
//                default:
//                    System.out.println("Invalid choice!");
//            }
//        }

//        USerControl<Person> userControl2 = new USerControl<>();

        //  wrapper class - Object cua kieu du lieu nguyen thuy
//        User<Double, String> u1 = new User<Double, String>("An", 20.0, "20/11/2024");
//        User<Integer, String> u2 = new User<Integer, String>("An", 20, "20/11/2024");
//        User<String, String> u3 = new User<>("Khanh", "20", "20/11/2024");
    }
}
