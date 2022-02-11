package com.innova.solid.interfaceSegregation.unprincipled;

public class Notebook extends Computer {
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
