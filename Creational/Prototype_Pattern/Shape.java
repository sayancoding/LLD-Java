package Creational.Prototype_Pattern;


// Prototype : Shape
public interface Shape extends Cloneable {
    public Object clone() throws CloneNotSupportedException;
    public void show();
    
}
