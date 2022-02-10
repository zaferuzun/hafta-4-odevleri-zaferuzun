package com.innova.solid.singleResponsibility.principled;

import javax.swing.text.html.parser.Entity;
import java.util.List;

public class CustomerUtils {
    /**
     *
     */
    public CustomerEntity cutomerDtoToCustomerEntity(CustomerDto customerDto){
        CustomerEntity customerEntity=null;
        /**
         * mapping işlemleri yada
         * hazır mapping fonksiyonları
         */


        return customerEntity;
    }

    public boolean customerNameCheck(CustomerDto customerDto, List<CustomerEntity> customerEntitys){

        //stream çıktısı denenmedi
        return customerEntitys.stream()
                .map(CustomerEntity::getCustomerName).
                        anyMatch(customerName -> customerName.equals(customerDto.getCustomerName()));
    }

}
