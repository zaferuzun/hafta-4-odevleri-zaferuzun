package com.innova.solid.dependencyInversion.principled;

public class Audi implements ICar{
    @Override
    public void features(){
        System.out.println("Audi'nin özellikleri");
    }
}
