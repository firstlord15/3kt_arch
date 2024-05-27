package AbstractFactory.AbstractFactoryCreator;

import AbstractFactory.InterfaceProduct.*;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
