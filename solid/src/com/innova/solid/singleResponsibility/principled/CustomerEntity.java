package com.innova.solid.singleResponsibility.principled;

import lombok.Data;

//@Table("customer")
@Data
public class CustomerEntity {

    private String customerId;
    private String customerName;
    private String customerEmail;
}
