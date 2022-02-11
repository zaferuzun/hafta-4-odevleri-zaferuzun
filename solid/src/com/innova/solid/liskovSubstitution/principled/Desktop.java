package com.innova.solid.liskovSubstitution.principled;


public class Desktop extends Computer implements IGraphic {
    //GPU ve Ram üst class'ın tanımlamaları geçerli olacaktır.
    //Grafik kartı için interface implement edildi.
    //Ekran boyutu bulunmayacaktır.
    @Override
    public void getGraphicsCard() {
        System.out.println("3090");
    }


}
