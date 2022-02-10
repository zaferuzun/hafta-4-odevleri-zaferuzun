package com.innova.solid.openClosed.unprincipled;

public class CharacterManager {

    public void getCharacterHealt(){
        Character character = new Character();
        //Kullanıcıdan veya dbden çekilen bir deger
        String tempName= "Sett";
        int healt =character.getCharacterHealt(tempName);
        System.out.println(healt);
    }

}
