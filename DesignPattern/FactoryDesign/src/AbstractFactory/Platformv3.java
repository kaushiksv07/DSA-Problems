package AbstractFactory;

public abstract class Platformv3 {
    public void setRefresh(){
        System.out.println("Platform refreshed");
    }

    public abstract UIComponentFactoryv3 getUiComponentFactory();
}
