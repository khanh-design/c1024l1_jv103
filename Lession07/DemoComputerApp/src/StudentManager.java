package src;

public class StudentManager implements Manager {

    @Override
    public void add(Object obj) {

    }

    @Override
    public void remove(Object obj) {

    }

    @Override
    public void edit(Object obj) {

    }

    @Override
    public void viewAll() {

    }

    public boolean isAdmin(Object obj) {
        return obj.equals(Role.ROLE_ADMIN);
    }
}
