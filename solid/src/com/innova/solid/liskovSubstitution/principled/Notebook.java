package com.innova.solid.liskovSubstitution.principled;

public class Notebook extends Computer implements IScreen {
    //Grafik kartı olarak üst classın Grafik kartı'su geçerli olacaktır

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
        System.out.println("11 inc");

    }
}
