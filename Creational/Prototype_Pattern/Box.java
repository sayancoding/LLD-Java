package Creational.Prototype_Pattern;


//Concrete Prototype : Box
public class Box implements Shape {
    private int width;
    private int height;

    public Box(){}
    
    public Box(int width, int height) throws InterruptedException {
        System.out.println("Creating Box object...");
        this.width = width;
        this.height = height;

        Thread.sleep(5000);
    }

    public Object clone() throws CloneNotSupportedException{
        System.out.println("Deep Cloning Box object...");
        return super.clone();
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String toString(){
        return "Box: width = " + width + ", height = " + height + ", hashCode = " + this.hashCode();
    }

    @Override
    public void show() {
        System.out.println("Box: width = " + width + ", height = " + height + ", hashCode = " + this.hashCode());
    }

}
