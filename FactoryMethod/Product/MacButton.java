package FactoryMethod.Product;

import FactoryMethod.InterfaceProduct.Button;

public class MacButton implements Button {
    @Override
    public void render() {
        System.out.println("Mac button");
    }
}
