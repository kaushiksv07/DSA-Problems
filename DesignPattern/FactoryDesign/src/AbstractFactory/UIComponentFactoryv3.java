package AbstractFactory;

import Compoenents.Buttons.Button;
import Compoenents.DropDowns.DropDowns;

public interface UIComponentFactoryv3 {
    Button createButton();
    DropDowns createDropDowns();
}
