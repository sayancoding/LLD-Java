package Creational.Factory_Pattern;

public class Main {
    public static void main(String[] args) {
        ProductFactory productFactory = new ProductFactory();

        Product mobile = productFactory.getProduct("Mobile", "Samsung", "Galaxy S21", "Phantom Gray", 28999);
        Product laptop = productFactory.getProduct("Laptop", "Apple", "MacBook Pro", "Space Gray", 129900);

        System.out.println(mobile.getDetails());
        System.out.println(laptop.getDetails());

        System.out.println(mobile.getClass());
        System.out.println(laptop.getClass());
    }
}

/**
 * Output
 * 
 * Mobile [brand=Samsung, model=Galaxy S21, color=Phantom Gray, price=28999]
 * Laptop [brand=Apple, model=MacBook Pro, color=Space Gray, price=129900]
 * class Factory_Pattern.Mobile
 * class Factory_Pattern.Laptop
 */
