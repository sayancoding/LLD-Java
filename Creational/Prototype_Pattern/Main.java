package Creational.Prototype_Pattern;

/**
 * Prototype Design Pattern in Java
 *
 * The Prototype pattern is a creational design pattern that allows you to create new objects by copying an existing object, known as the prototype.
 * This pattern is useful when creating objects is expensive or complex, and you want to avoid repeating the creation process.
 *
 * Key Concepts:
 * - Prototype: The interface or abstract class that declares the clone method.
 * - Concrete Prototype: The concrete class that implements the clone method and creates a copy of itself.
 * - Client: The class that uses the prototype to create new objects.
 */


 //Client : Main
public class Main{
    public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {
        Box boxOriginal = new Box(10, 20);
        System.out.println("Original : "+boxOriginal);

        Box boxClone = (Box) boxOriginal.clone();
        System.out.println("Clone : "+boxClone);

        System.out.println("\nAfter modifying cloned object...\n"); 

        boxClone.setHeight(30);
        boxClone.setWidth(40);

        System.out.println("Original : "+boxOriginal);
        System.out.println("Clone : "+boxClone);

    }
}