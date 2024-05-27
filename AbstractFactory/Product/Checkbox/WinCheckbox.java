package AbstractFactory.Product.Checkbox;

import AbstractFactory.InterfaceProduct.*;

public class WinCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Windows Checkbox");
    }
}
