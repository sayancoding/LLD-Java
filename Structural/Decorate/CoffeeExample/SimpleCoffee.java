package Structural.Decorate.CoffeeExample;

public class SimpleCoffee implements Coffee {

    @Override
    public String getDescription() {
        return "Basic Coffee";
    }

    @Override
    public int getPrice() {
        return 5;
    }
    
}
