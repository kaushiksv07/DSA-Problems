package FactoryMethod;

import Compoenents.Buttons.Button;

public class Client {
    public static void main(String[] args) {
        Platform p = new Android();
        Button b = p.createButton();
        b.click();
    }
}
