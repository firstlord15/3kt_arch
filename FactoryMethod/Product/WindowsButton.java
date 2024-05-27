package FactoryMethod.Product;

import FactoryMethod.InterfaceProduct.Button;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Windows button");
    }
}
