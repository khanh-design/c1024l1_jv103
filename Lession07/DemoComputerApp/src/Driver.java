package src;

public abstract class Driver {
    private String name;
    private int volume;
    private String author;


    public Driver(String name, int volume, String author) {
        this.name = name;
        this.volume = volume;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
