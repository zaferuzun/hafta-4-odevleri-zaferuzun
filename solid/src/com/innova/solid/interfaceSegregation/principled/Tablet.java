package com.innova.solid.interfaceSegregation.principled;


public class Tablet implements IComputer,IScreen {
    @Override
    public void getGPU() {
        System.out.println("i5");
    }

    @Override
    public void getRam() {
        System.out.println("8gb");
    }

    @Override
    public void getScreenSize() {
        System.out.println("10inc");

    }
}
