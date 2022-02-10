package com.innova.solid.openClosed.principled;

public class Sett implements ICharacter{

    GeneralModel settModel=new GeneralModel();
    public Sett()
    {
        settModel.setCharacterName("Sett");
        settModel.setCharacterHealt(660);
    }

    @Override
    public int getHealt() {
        return this.settModel.getCharacterHealt();
    }

    @Override
    public String getName() {
        return this.settModel.getCharacterName();
    }
}
