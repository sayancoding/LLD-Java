package Creational.Abstract_Factory_Pattern;

// Concrete Factory
public class MacGuiFactory implements GuiFactory {
    @Override
    public Button buildButton() {
        return new MacButton();
    }
}
