package src;

public class DriverHDD extends Driver{
    protected String type;

    public DriverHDD(String name, int volume, String author, String type) {
        super(name, volume, author);
        this.type = type;
    }
}
