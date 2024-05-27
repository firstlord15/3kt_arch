package AbstractFactory.AbstractCreator;

import AbstractFactory.AbstractFactoryCreator.GUIFactory;
import AbstractFactory.InterfaceProduct.*;
import AbstractFactory.Product.Button.*;
import AbstractFactory.Product.Checkbox.*;

public class WinFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WinCheckbox();
    }
}
