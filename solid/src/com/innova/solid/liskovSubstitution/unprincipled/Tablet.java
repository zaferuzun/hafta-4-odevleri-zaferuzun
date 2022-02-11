package com.innova.solid.liskovSubstitution.unprincipled;

public class Tablet extends Computer{
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
    //Tabletlerde grafik kartı olmadıgını varsayarsak grafik kartı kısmı bulunmaması gerekir.
}
