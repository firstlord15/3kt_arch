package AbstractFactory;

import AbstractFactory.AbstractFactoryCreator.GUIFactory;
import AbstractFactory.AbstractCreator.*;
import AbstractFactory.InterfaceProduct.*;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }

    public static void main(String[] args) {
        GUIFactory factory;
        String osType = "Windows";

        if (osType.equalsIgnoreCase("Windows")) {
            factory = new WinFactory();
        } else {
            factory = new MacFactory();
        }

        Application app = new Application(factory);
        app.paint();
    }
}