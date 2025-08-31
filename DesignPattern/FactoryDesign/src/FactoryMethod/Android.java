package FactoryMethod;

import Compoenents.Buttons.AndrioidButton;
import Compoenents.Buttons.Button;

public class Android extends Platform {
    @Override
    public Button createButton() {
        return new AndrioidButton();
    }
}
