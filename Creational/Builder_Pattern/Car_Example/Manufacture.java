package Creational.Builder_Pattern.Car_Example;


// Director: CarManufacturer
public class Manufacture {

    private CarBuilder carBuilder;

    public void setBuilder(CarBuilder carBuilder){
        this.carBuilder = carBuilder;
    }

    public Car getCar(){
        return carBuilder.getCar();
    }
    
}
