package Creational.Builder_Pattern.Car_Example;


// Concrete Builder : SportsCarBuilder
public class SportsCarBuilder implements CarBuilder {
    private Car car;
    
    public SportsCarBuilder() {
        car = new Car();
    }
    
    @Override
    public void buildBody() {
        car.setBody("Sleek, aerodynamic body");
    }

    @Override
    public void buildEngine() {
        car.setEngine("Powerful V8 engine");
    }

    @Override
    public void buildWheels() {
        car.setWheels("High-performance alloy wheels");
    }

    @Override
    public void buildInterior() {
        car.setInterior("Luxury sports interior with leather seats");
    }

    @Override
    public Car getCar() {
        return car;
    }
    
}
