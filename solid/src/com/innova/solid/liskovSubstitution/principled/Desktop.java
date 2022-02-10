package com.innova.solid.liskovSubstitution.principled;


public class Desktop extends Computer implements IGraphic {
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
