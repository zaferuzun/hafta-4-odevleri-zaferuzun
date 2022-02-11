package com.innova.solid.dependencyInversion.unprincipled;

public class CarManager {

    //daha üst bir sınıf olan manager sınıfı diger araç sınıflarına bagımlı oldu

    Audi audi = new Audi();
    Volkswagen volkswagen = new Volkswagen();

    public void carFeatures(String carBrand){

        if(carBrand.equals("audi"))
        {
            audi.features();
        }else if(carBrand.equals("volkswagen")){
            volkswagen.features();
        }
        else {
            System.out.println("belirttiginiz araç bulunamadı");
        }
    }

}
