package com.innova.solid.singleResponsibility.unprincipled;

import lombok.Data;

import java.util.Arrays;
import java.util.regex.*;

@Data
public class CustomerOperation {

    private String customerId;
    private String customerName;
    private String customerEmail;

    //Email Validation
    public boolean emailValidation(String customerEmail){

        Pattern emailPattern = Pattern.compile("\\b[A-Z0-9._%-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}\\b");
        Matcher emailMatcher = emailPattern.matcher(customerEmail);
        return emailMatcher.find();
    }
    enum DB{
        Ahmet,
        Ali,
        Ayse,
        Fatma
    }
    public boolean customerNameCheck(String customerName){
        boolean nameCheck=true;

        /**
         * Db connection işlemleri
         * veri getirme işlemleri
         * ornek DB enum
         */

        //Stream ile check kontrolü
        nameCheck=Arrays.stream(DB.values())
                .anyMatch(dbValue-> customerName.equals(String.valueOf(dbValue)));

        return nameCheck;
    }




}
