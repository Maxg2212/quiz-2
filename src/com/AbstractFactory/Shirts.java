package com.AbstractFactory;

public interface Shirts {
    void paint();
}

class NikeShirts implements GUIFactory {
    public void paint() {
        System.out.println("Camisa Nike");
    }
}
class PumaShirts implements GUIFactory {
    public void paint() {
        System.out.println("Camisa Puma");
    }

}

