package Bai3;

import java.io.Serializable;

public class Sanpham implements Serializable {
    private int id;
    private String name;
    private double price;
    private String manufactured;
    private String description;

    public Sanpham(int id, String name, double price, String manufactured, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.manufactured = manufactured;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getManufactured() {
        return manufactured;
    }

    public void setManufactured(String manufactured) {
        this.manufactured = manufactured;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Sanpham{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", manufactured='" + manufactured + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
