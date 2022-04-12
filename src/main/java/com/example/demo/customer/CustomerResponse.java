package com.example.demo.customer;

import lombok.*;

@Setter
@Getter
public class CustomerResponse {

    public CustomerResponse(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String firstName;
    public String lastName;

}
