package com.innova.solid.liskovSubstitution.principled;

public abstract class Computer {
    public abstract void getGPU();
    public abstract void getRam();

    //computer için herkes için geçerli bir yapı oluşturduk.
    //Eksik olan yapılar için ayrı interface'ler oluşturup onları mevcut olanlara bagladık.
}
