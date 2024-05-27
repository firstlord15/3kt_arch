package AbstractFactory.Product.Checkbox;

import AbstractFactory.InterfaceProduct.*;

public class MacCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Mac Checkbox");
    }
}
