package FactoryMethod;

import Compoenents.Buttons.Button;

public abstract class Platform {
    public void setRefresh(){
        System.out.println("Platform refreshed");
    }

    public abstract Button createButton();
    // all the dependency need to added hear
    //but platform will not be happy if we do this
    //as platform will not be able to take all burden like button, calender etc
    //So abstract factory came into picture
}
