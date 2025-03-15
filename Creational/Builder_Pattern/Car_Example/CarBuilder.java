package Creational.Builder_Pattern.Car_Example;

// Builder 
public interface CarBuilder {
    void buildBody();
    void buildEngine();
    void buildWheels();
    void buildInterior();
    Car getCar();
}
