package AbstractFactory;

import Compoenents.Buttons.Button;
import Compoenents.Buttons.IosButton;
import FactoryMethod.Platform;

public class IOSv3 extends Platformv3 {


    @Override
    public UIComponentFactoryv3 getUiComponentFactory() {
        return new  AndroidComponentFactoryv3();
    }
}
