package com.AbstractFactory;

class NikeFactory implements GUIFactory {
    public Shirts createShirts() {

        return new NikeShirts();
    }

    public Shoes createShoes() {

        return new NikeShoes();
    }

}
