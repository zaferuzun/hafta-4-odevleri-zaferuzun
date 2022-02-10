package com.innova.solid;

import com.innova.solid.openClosed.principled.CharacterManager;
import com.innova.solid.openClosed.principled.Kayn;
import com.innova.solid.openClosed.principled.LeeSin;
import com.innova.solid.openClosed.principled.Sett;
import com.innova.solid.singleResponsibility.unprincipled.CustomerOperation;

public class MainTest {


    public static void main(String[] args) {
        /**
         * SINGLE RESPONSIBILITY TEST
         */
        //unprincipled
        CustomerOperation customerOperation=new CustomerOperation();
        System.out.println(customerOperation.customerNameCheck("Ahmet"));

        /**
         * OPEN CLOSED
         */

        CharacterManager characterManager= new CharacterManager(new LeeSin());
        System.out.println(characterManager.getName() +" " + characterManager.getHealt());

    }
}
