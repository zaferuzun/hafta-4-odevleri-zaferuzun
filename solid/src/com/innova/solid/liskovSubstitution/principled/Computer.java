package com.innova.solid.liskovSubstitution.principled;

public abstract class Computer {
    public void getGPU(){
        System.out.println("i3");
    }
    public void getRam(){
        System.out.println("8gb");
    }

    //computer için herkes için geçerli bir yapı oluşturduk.
    //Eksik olan yapılar için ayrı interface'ler oluşturup onları mevcut olanlara bagladık.
}
