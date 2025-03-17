package Creational.Abstract_Factory_Pattern;


/**
 * Abstract Factory Design Pattern in Java
 *
 * The Abstract Factory pattern provides an interface for creating families of related or dependent objects without specifying their concrete classes.
 * It's a creational pattern that helps in creating objects that are part of a family or theme.
 *
 * Key Concepts:
 * - Abstract Factory: Declares an interface for operations that create abstract product objects.
 * - Concrete Factory: Implements the abstract factory interface to produce a family of related products.
 * - Abstract Product: Declares an interface for a type of product object.
 * - Concrete Product: Defines a product object to be created by the corresponding concrete factory.
 * - Client: Uses the abstract factory and abstract products.
 * 
 */

 //Client
public class Main {
    public static void main(String[] args) {
        GuiFactory factory = null;
        String os = System.getProperty("os.name").toLowerCase();
        
        if (os.contains("mac")) {
            factory = new MacGuiFactory();
        } else if (os.contains("windows")) {
            factory = new WindowsGuiFactory();
        } else {
            System.out.println("Unknown OS");
            System.exit(1);
        }

        Button button = factory.buildButton();
        button.render();
    }
}
