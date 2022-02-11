package com.innova.solid.liskovSubstitution.unprincipled;

public class Notebook extends Computer{
    @Override
    public void getGPU() {
        System.out.println("Android");
    }

    @Override
    public void getRam() {
        System.out.println("1gb");
    }

    @Override
    public void getScreenSize() {
        System.out.println("11 inc");

    }

}
