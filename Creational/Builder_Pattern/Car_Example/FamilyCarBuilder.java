package Creational.Builder_Pattern.Car_Example;


// Concrete Builder : FamilyCarBuilder
public class FamilyCarBuilder implements CarBuilder{
    private Car car;

    public FamilyCarBuilder() {
        car = new Car();
    }

    @Override
    public void buildBody() {
        car.setBody("Spacious, practical body");
    }

    @Override
    public void buildEngine() {
        car.setEngine("Fuel-efficient inline-4 engine");
    }

    @Override
    public void buildInterior() {
        car.setInterior("Standard steel wheels");
    }

    @Override
    public void buildWheels() {
        car.setWheels("Comfortable family interior with cloth seats");
    }

    @Override
    public Car getCar() {
        return car;
    }
}
