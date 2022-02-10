package com.innova.solid.singleResponsibility.principled;

public class CustomerManager {
    CustomerRepositoryImp customerRepositoryImp;
    CustomerValidation customerValidation;
    CustomerDto customerDto;
    CustomerUtils customerUtils;
    CustomerEntity customerEntity=null;

    //CustomerDto kullanıcıdan gelen herhangi bir deger oldugunu varsayalım
    CustomerManager(){
        this.customerDto= CustomerDto.builder().customerEmail("email@email.com").customerName("Zafer").build();
    }

    public boolean customerCheck()
    {
        // validasyon için gerekli parametreleri gönderildi
       return customerUtils.customerNameCheck(this.customerDto,customerRepositoryImp.getCustomer()) ? true : false;
    }





}
