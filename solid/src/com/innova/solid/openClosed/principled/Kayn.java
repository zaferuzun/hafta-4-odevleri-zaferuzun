package com.innova.solid.openClosed.principled;

public class Kayn implements ICharacter{

    GeneralModel kaynModel= new GeneralModel();
    public Kayn()
    {
        kaynModel.setCharacterName("Kayn");
        kaynModel.setCharacterHealt(620);
    }

    @Override
    public int getHealt() {
        return this.kaynModel.getCharacterHealt();
    }

    @Override
    public String getName() {
        return this.kaynModel.getCharacterName();
    }
}
