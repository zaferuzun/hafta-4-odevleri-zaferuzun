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
    public void getGraphicsCard() {
        //tabletler için grafik kartı bulunmadıgını varsayalım dolayısıyla grafik kartı kısmı ile ilgili kısım bulunmamalıdır.
    }

    @Override
    public void getScreenSize() {
        System.out.println("10inc");

    }
}
