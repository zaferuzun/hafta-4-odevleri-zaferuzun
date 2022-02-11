package com.innova.solid.interfaceSegregation.principled;

public class Notebook implements IComputer,IScreen, IGraphic {
    @Override
    public void getGPU() {
        System.out.println("i5");
    }

    @Override
    public void getRam() {
        System.out.println("8gb");
    }

    @Override
    public void getGraphicsCard() {
        System.out.println("3090");
    }

    @Override
    public void getScreenSize() {
        System.out.println("11 inc");

    }
}
