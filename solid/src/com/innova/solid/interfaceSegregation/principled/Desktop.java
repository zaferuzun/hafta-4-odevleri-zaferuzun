package com.innova.solid.interfaceSegregation.principled;


public class Desktop implements IComputer,IGraphic {
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


}
