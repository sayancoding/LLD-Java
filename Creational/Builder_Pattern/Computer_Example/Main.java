package Creational.Builder_Pattern.Computer_Example;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer.Builder()
                .cpu("Intel i7")
                .ram("16GB")
                .storage("1TB")
                .gpu("Nvidia RTX 2080")
                .build();
        System.out.println(computer);
    }
}
