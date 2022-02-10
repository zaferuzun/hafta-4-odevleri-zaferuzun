package com.innova.solid;

import com.innova.solid.singleResponsibility.unprincipled.CustomerOperation;

public class MainTest {


    public static void main(String[] args) {
        /**
         * SINGLE RESPONSIBILITY TEST
         */
        //unprincipled
        CustomerOperation customerOperation=new CustomerOperation();
        System.out.println(customerOperation.customerNameCheck("Ahmet"));

    }
}
