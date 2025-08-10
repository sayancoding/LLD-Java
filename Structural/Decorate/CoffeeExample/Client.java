package Structural.Decorate.CoffeeExample;

public class Client {
    public static void main(String[] args) {
        // Create a simple coffee
        Coffee coffee = new SimpleCoffee();
        System.out.println("Description: " + coffee.getDescription() + ", Cost: $" + coffee.getPrice());

        // Add milk to the coffee
        coffee = new MilkDecorator(coffee);
        System.out.println("Description: " + coffee.getDescription() + ", Cost: $" + coffee.getPrice());

        // Add sugar to the coffee (after milk)
        coffee = new SugarDecorator(coffee);
        System.out.println("Description: " + coffee.getDescription() + ", Cost: $" + coffee.getPrice());

        // Create a new coffee with milk and then sugar
        Coffee customCoffee = new SugarDecorator(new MilkDecorator(new SimpleCoffee()));
        System.out.println("Description: " + customCoffee.getDescription() + ", Cost: $" + customCoffee.getPrice());
    
    }
}
