package Structural.Decorate.CoffeeExample;

public class MilkDecorator extends CoffeeDecorator{

    MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", with Milk";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 5;
    }
    
}
