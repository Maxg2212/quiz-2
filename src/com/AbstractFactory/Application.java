package com.AbstractFactory;

class Application {
    public Application(GUIFactory factory) {
        Shoes shoes = factory.createShoes();
        Shirts shirts = factory.createShirts();
        shoes.paint();
        shirts.paint();
    }
}
