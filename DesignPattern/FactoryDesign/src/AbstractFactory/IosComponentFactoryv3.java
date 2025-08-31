package AbstractFactory;

import Compoenents.Buttons.Button;
import Compoenents.Buttons.IosButton;
import Compoenents.DropDowns.AndroidDropDown;
import Compoenents.DropDowns.DropDowns;

public class IosComponentFactoryv3 implements UIComponentFactoryv3 {

    @Override
    public Button createButton() {
        return new IosButton();
    }

    @Override
    public DropDowns createDropDowns() {
        return new AndroidDropDown();
    }
}
