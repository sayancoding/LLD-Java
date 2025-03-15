package Creational.Builder_Pattern.Car_Example;

// Product : Car
public class Car {
    private String body;
    private String engine;
    private String wheels;
    private String interior;
    
    public void setBody(String body) {
        this.body = body;
    }
    public void setEngine(String engine) {
        this.engine = engine;
    }
    public void setWheels(String wheels) {
        this.wheels = wheels;
    }
    public void setInterior(String interior) {
        this.interior = interior;
    }
    @Override
    public String toString() {
        return "Car [body=" + body + ", engine=" + engine + ", wheels=" + wheels + ", interior=" + interior + "]";
    }

}
