package com.innova.solid.liskovSubstitution.unprincipled;

import jdk.jshell.spi.ExecutionControl;

public class Desktop extends Computer{
    @Override
    public void getGraphicsCard() {
        System.out.println("3090");
    }

    //desktop bilgisayarlar için monitör harici olarak baglandıgı için ekran boyutu olmadıgını varsayalım
    //dolayısıyla ekran boyutu kısmı bulunmaması gerekiyor.
}
