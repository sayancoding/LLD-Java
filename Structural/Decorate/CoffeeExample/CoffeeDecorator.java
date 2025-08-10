package Structural.Decorate.CoffeeExample;

public abstract class CoffeeDecorator implements Coffee{
    Coffee coffee;

    CoffeeDecorator(Coffee coffee){
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription();
    }

    @Override
    public int getPrice() {
        return coffee.getPrice();
    }

}
