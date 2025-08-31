import Compoenents.Buttons.AndrioidButton;
import Compoenents.Buttons.Button;
import Compoenents.Buttons.IosButton;
import Compoenents.DropDowns.AndroidDropDown;
import Compoenents.DropDowns.DropDowns;
import Compoenents.DropDowns.IosDropDown;

public class SimpleFactoryClient {
    public static void main(String[] args) {
        Platform p = new Android();
        Button buttton;
        DropDowns dropDown;
//        if(p instanceof Android){
//            buttton = new AndrioidButton();
//            dropDown = new AndroidDropDown();
//        }else if(p instanceof IOS){
//            buttton = new IosButton();
//            dropDown = new IosDropDown();
//        }else{
//            throw  new IllegalArgumentException("Type not found");
//        }
//        buttton.click();
//        dropDown.showDropDown();
        //This is a basic factory but we can face problems like SRP and OCP
        //So simple factory is implemented hear where all buisness logics are moved to
        SimplePlatformFactory simplePlatformFactory = new SimplePlatformFactory();
        buttton =  simplePlatformFactory.getButton(p);
        dropDown = simplePlatformFactory.getDropDowns(p);
        buttton.click();
        dropDown.showDropDown();

    }
}
