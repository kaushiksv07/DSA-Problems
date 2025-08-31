package FactoryMethod;

import Compoenents.Buttons.Button;
import Compoenents.Buttons.IosButton;

public class IOS extends Platform {
    @Override
    public Button createButton() {
        return new IosButton();
    }
}
