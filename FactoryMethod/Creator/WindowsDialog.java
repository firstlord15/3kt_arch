package FactoryMethod.Creator;

import FactoryMethod.AbstractCreator.Dialog;
import FactoryMethod.InterfaceProduct.Button;
import FactoryMethod.Product.WindowsButton;

public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}