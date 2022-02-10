package com.innova.solid.openClosed.principled;

public class LeeSin implements ICharacter{

    GeneralModel leeSinModel=new GeneralModel();
    public LeeSin()
    {
        leeSinModel.setCharacterName("Lee Sin");
        leeSinModel.setCharacterHealt(610);
    }

    @Override
    public int getHealt() {
        return this.leeSinModel.getCharacterHealt();
    }

    @Override
    public String getName() {
        return this.leeSinModel.getCharacterName();
    }
}
