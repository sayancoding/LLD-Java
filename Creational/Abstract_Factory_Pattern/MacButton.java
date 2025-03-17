package Creational.Abstract_Factory_Pattern;

// Concrete Product
public class MacButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering a Mac button.");
    }
}
