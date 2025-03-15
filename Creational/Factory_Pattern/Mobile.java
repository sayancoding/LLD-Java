package Creational.Factory_Pattern;

public class Mobile implements Product {
    private String brand;
    private String model;
    private String color;
    private int price;

    public Mobile(String brand, String model, String color, int price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public String getDetails() {
        return "Mobile [brand=" + brand + ", model=" + model + ", color=" + color + ", price=" + price + "]";
    }
}
