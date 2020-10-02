package com.AbstractFactory;


import java.lang.reflect.Method;

interface GUIFactory {
    Shoes createShoes();
    Shirts createShirts();
}
