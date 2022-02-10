package com.innova.solid.openClosed.unprincipled;

public class Character {

    public int getCharacterHealt(String characterName){
        if (characterName.equals("Sett")) {
            return 660;
        } else if (characterName.equals("Kayn")) {
            return 620;
        } else if (characterName.equals("LeeSin")) {
            return 640;
        } else {
            return 0;
        }

    }

}
