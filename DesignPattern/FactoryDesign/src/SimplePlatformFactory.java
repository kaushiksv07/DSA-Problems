import Compoenents.Buttons.AndrioidButton;
import Compoenents.Buttons.Button;
import Compoenents.Buttons.IosButton;
import Compoenents.DropDowns.AndroidDropDown;
import Compoenents.DropDowns.DropDowns;
import Compoenents.DropDowns.IosDropDown;

public class SimplePlatformFactory {

    public Button getButton(Platform platform){
        if(platform instanceof Android){
            return new AndrioidButton();
        }else if(platform instanceof IOS){
            return new IosButton();
        }else{
            throw  new IllegalArgumentException("Invalid Platform");
        }
    }

    public DropDowns getDropDowns(Platform platform){
        if(platform instanceof Android){
            return new AndroidDropDown();
        }else if(platform instanceof IOS){
            return new IosDropDown();
        }else {
            throw  new IllegalArgumentException("Invalid Platform");
        }
    }
}
