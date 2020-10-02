package com.AbstractFactory;

class PumaFactory implements GUIFactory{
    public Shirts createShirts() {

        return (Shirts) new PumaShirts();
    }

    @Override
    public Shoes createShoes() {

        return new PumaShoes();
    }

}
