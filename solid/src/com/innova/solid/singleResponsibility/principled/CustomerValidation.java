package com.innova.solid.singleResponsibility.principled;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//implement Validation
public class CustomerValidation {

    //Email Validation
    public boolean emailValidation(CustomerDto customerDto){

        Pattern emailPattern = Pattern.compile("\\b[A-Z0-9._%-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}\\b");
        Matcher emailMatcher = emailPattern.matcher(customerDto.getCustomerEmail());
        return emailMatcher.find();
    }

}
