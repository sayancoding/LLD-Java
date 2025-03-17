package Creational.Abstract_Factory_Pattern;

// Concrete Factory
public class WindowsGuiFactory implements GuiFactory {
    @Override
    public Button buildButton() {
        return new WindowsButton();
    }
}
