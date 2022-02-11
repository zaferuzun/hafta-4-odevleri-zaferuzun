package com.innova.solid.liskovSubstitution.principled;


public class Tablet extends Computer implements IScreen {

    //Gpu olarak üst classın gpu'su geçerli olacaktır
    //Screen için interface implement edildi.
    //Grafik kartı bulunmayacaktır.

    @Override
    public void getRam() {
        System.out.println("1gb");
    }

    @Override
    public void getScreenSize() {
        System.out.println("10inc");

    }
}
