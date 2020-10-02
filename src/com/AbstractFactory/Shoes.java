package com.AbstractFactory;

public interface Shoes {
    void paint();

}

class NikeShoes implements GUIFactory {
    public void paint() {
        System.out.println("Zapatos Nike");
    }
}

class PumaShoes implements GUIFactory {
    public void paint() {
        System.out.println("Zapatos Puma");
    }
}
