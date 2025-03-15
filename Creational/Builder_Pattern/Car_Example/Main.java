package Creational.Builder_Pattern.Car_Example;


// Client
public class Main {
    public static void main(String[] args) {
        
        Manufacture hondaManufacture = new Manufacture();
        
        CarBuilder sportsCarBuilder = new SportsCarBuilder();
        sportsCarBuilder.buildBody();
        sportsCarBuilder.buildEngine();
        sportsCarBuilder.buildWheels();
        sportsCarBuilder.buildInterior();

        hondaManufacture.setBuilder(sportsCarBuilder);
        System.out.println("Honda - " +hondaManufacture.getCar());

        CarBuilder familyCarBuilder = new FamilyCarBuilder();
        familyCarBuilder.buildBody();
        familyCarBuilder.buildEngine();
        familyCarBuilder.buildWheels();
        familyCarBuilder.buildInterior();

        hondaManufacture.setBuilder(familyCarBuilder);
        System.out.println("Honda - " +hondaManufacture.getCar());

    }
    
}

// Output
// Honda - Car [body=Sleek, aerodynamic body, engine=Powerful V8 engine, wheels=High-performance alloy wheels, interior=Luxury sports interior with leather seats]
// Honda - Car [body=Spacious, practical body, engine=Fuel-efficient inline-4 engine, wheels=Comfortable family interior with cloth seats, interior=Standard steel wheels]
