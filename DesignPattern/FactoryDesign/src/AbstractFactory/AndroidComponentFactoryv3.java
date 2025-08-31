package AbstractFactory;

import Compoenents.Buttons.AndrioidButton;
import Compoenents.Buttons.Button;
import Compoenents.DropDowns.AndroidDropDown;
import Compoenents.DropDowns.DropDowns;

public class AndroidComponentFactoryv3 implements UIComponentFactoryv3 {

    @Override
    public Button createButton() {
        return new AndrioidButton();
    }

    @Override
    public DropDowns createDropDowns() {
        return new AndroidDropDown();
    }
}
