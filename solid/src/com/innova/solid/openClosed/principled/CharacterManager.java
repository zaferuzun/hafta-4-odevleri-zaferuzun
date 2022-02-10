package com.innova.solid.openClosed.principled;

public class CharacterManager {

    //GeneralModel bagımlılık gibi gözükebilir daha güzel gözükmesi için eklenmiştir :)
    // yeni karakterler geldikçe yeni classlar ile varolanlara dokunulmadan eklenebilecekler
    private ICharacter iCharacter;

    public CharacterManager(ICharacter iCharacter){
        this.iCharacter=iCharacter;
    }

    public int getHealt(){
        return iCharacter.getHealt();
    }
    public String getName(){
        return iCharacter.getName();
    }


}
