package AbstractFactory.AbstractCreator;

import AbstractFactory.AbstractFactoryCreator.GUIFactory;
import AbstractFactory.InterfaceProduct.*;
import AbstractFactory.Product.Button.*;
import AbstractFactory.Product.Checkbox.*;

public class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}