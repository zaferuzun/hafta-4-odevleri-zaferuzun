package com.innova.solid.dependencyInversion.principled;

public class CarManager {

    //CarManager sınıfını bagımlılıklardan kurtarmış olduk.
    //Diger sınıflardan istedigimiz kadar ekleyip kullanabiliriz
    //Bu kullanım işleminde Manager sınıfında herhangi bir degişiklik yapmamıza gerek yoktur.
    private ICar iCar;

    public CarManager(ICar iCar){

        this.iCar=iCar;
    }

    public void carFeatures(){
        iCar.features();
    }

}
