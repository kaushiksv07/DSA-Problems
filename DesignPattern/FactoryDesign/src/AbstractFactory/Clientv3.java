package AbstractFactory;

import Compoenents.Buttons.Button;
import Compoenents.DropDowns.DropDowns;

public class Clientv3 {
    public static void main(String[] args) {
        Platformv3 p = new Androidv3();
        UIComponentFactoryv3 uiComponentFactory = p.getUiComponentFactory();
        Button button = uiComponentFactory.createButton();
        DropDowns dropDown = uiComponentFactory.createDropDowns();
        button.click();
        dropDown.showDropDown();

    }
}
