package com.innova.solid.dependencyInversion.unprincipled;

public class CarManager {

    //daha üst bir sınıf olan manager sınıfı diger araç sınıflarına bagımlı oldu

    Audi audi = new Audi();
    Volkswagen volkswagen = new Volkswagen();

    public void arabaOzellikleri(String carBrand){

        if(carBrand.equals("audi"))
        {
            audi.ozellik();
        }else if(carBrand.equals("volkswagen")){
            volkswagen.ozellik();
        }
        else {
            System.out.println("belirttiginiz araç bulunamadı");
        }
    }

}
