package FactoryMethod;

import FactoryMethod.AbstractCreator.Dialog;
import FactoryMethod.Creator.MacDialog;
import FactoryMethod.Creator.WindowsDialog;

public class Application {
    private static Dialog dialog;

    public static void initialize(String osType) {
        if (osType.equalsIgnoreCase("Windows")) {
            dialog = new WindowsDialog();
        } else if (osType.equalsIgnoreCase("Mac")) {
            dialog = new MacDialog();
        } else {
            throw new UnsupportedOperationException("Error! Unknown operating system.");
        }
    }

    public static void main(String[] args) {
        initialize("Windows");
        dialog.renderWindow();
    }
}