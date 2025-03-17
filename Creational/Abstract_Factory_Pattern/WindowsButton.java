package Creational.Abstract_Factory_Pattern;

// Concrete Product
public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering a Windows button.");
    }
    
}
