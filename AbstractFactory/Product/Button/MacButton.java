package AbstractFactory.Product.Button;

import AbstractFactory.InterfaceProduct.*;

public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("Mac Button");
    }
}