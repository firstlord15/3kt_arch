package AbstractFactory.Product.Button;

import AbstractFactory.InterfaceProduct.*;

public class WinButton implements Button {
    @Override
    public void paint() {
        System.out.println("Windows Button");
    }
}
