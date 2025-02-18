package src;

public class NguoiDung<T, K> {
    protected String _name;
    protected T _age;
    protected K _birthday;

    public NguoiDung(String name, T age, K birthday) {
        _name = name;
        _age = age;
        _birthday = birthday;
    }

    public NguoiDung(String name, T age) {
        _name = name;
        _age = age;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public T get_age() {
        return _age;
    }

    public void set_age(T _age) {
        this._age = _age;
    }

    @Override
    public String toString() {
        return "User{" +
                "_name='" + _name + '\'' +
                ", _age=" + _age +
                '}';
    }
}
