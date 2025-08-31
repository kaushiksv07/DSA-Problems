package AbstractFactory;

import Compoenents.Buttons.Button;
import FactoryMethod.Platform;

public class Androidv3 extends Platformv3 {


    @Override
    public UIComponentFactoryv3 getUiComponentFactory() {
        return new AndroidComponentFactoryv3();
    }
}
