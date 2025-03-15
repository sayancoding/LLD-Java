package Creational.Builder_Pattern.Computer_Example;

// Product
public class Computer {
    private String cpu;
    private String ram;
    private String storage;
    private String gpu;

    @Override
    public String toString() {
        return "Computer [cpu=" + cpu + ", ram=" + ram + ", storage=" + storage + ", gpu=" + gpu + "]";
    }

    // Builder
    public static class Builder{
        private String cpu;
        private String ram;
        private String storage;
        private String gpu;

        public Builder cpu(String cpu){
            this.cpu = cpu;
            return this;
        }
        public Builder ram(String ram){
            this.ram = ram;
            return this;
        }
        public Builder storage(String storage){
            this.storage = storage;
            return this;
        }
        public Builder gpu(String gpu){
            this.gpu = gpu;
            return this;
        }
        public Computer build(){
            Computer computer = new Computer();
            computer.cpu = this.cpu;
            computer.ram = this.ram;
            computer.storage = this.storage;
            computer.gpu = this.gpu;
            return computer;
        }

    }
}
