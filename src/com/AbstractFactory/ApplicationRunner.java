package com.AbstractFactory;

public class ApplicationRunner {
    public static void main(String[] args) {
        new Application(createBrandSpecificFactory());
    }

    public static GUIFactory createBrandSpecificFactory(){
        String brandname = System.getProperty("brand.name").toLowerCase();
        if(brandname != null && brandname.contains("nike"))
            return new NikeFactory();
        else
            return new PumaFactory();
    }
}
