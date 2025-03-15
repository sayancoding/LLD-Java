package Creational.Factory_Pattern;

public class ProductFactory {
    public Product getProduct(String productType, String brand, String model, String color, int price) {
        if (productType == null) {
            return null;
        }

        if (productType.equalsIgnoreCase("Mobile")) {
            return new Mobile(brand, model, color, price);
        } else if (productType.equalsIgnoreCase("Laptop")) {
            return new Laptop(brand, model, color, price);
        }

        return null;
    }
}
