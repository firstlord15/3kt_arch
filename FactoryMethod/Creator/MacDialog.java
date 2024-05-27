package FactoryMethod.Creator;

import FactoryMethod.AbstractCreator.Dialog;
import FactoryMethod.InterfaceProduct.Button;
import FactoryMethod.Product.MacButton;

public class MacDialog extends Dialog {
    @Override
    public Button createButton() {
        return new MacButton();
    }
}