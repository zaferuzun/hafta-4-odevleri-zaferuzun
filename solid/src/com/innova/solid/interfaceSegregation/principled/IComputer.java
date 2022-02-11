package com.innova.solid.interfaceSegregation.principled;

public interface IComputer {
    public abstract void getGPU();
    public abstract void getRam();

    //computer için herkes için geçerli bir yapı oluşturduk.
    //Eksik olan yapılar için ayrı interface'ler oluşturup onları mevcut olanlara bagladık. ve dummy code ortadan kaldırdık
}
