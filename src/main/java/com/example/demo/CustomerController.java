package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    CustomerRepository repository;

    @GetMapping("/find-all")
    public List<CustomerResponse> findAll(){

        List<Customer> customers = repository.findAll();
        List<CustomerResponse> customerResponseList = new ArrayList<>();

        for (Customer customer : customers) {
            customerResponseList.add(new CustomerResponse(customer.getFirstName(),customer.getLastName()));
        }

        return customerResponseList;
    }

}