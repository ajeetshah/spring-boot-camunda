package com.example.demo.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {
    @Autowired
    CustomerRepository repository;

    @GetMapping
    public List<CustomerResponse> findAll(){

        List<Customer> customers = repository.findAll();
        List<CustomerResponse> customerResponseList = new ArrayList<>();

        for (Customer customer : customers) {
            customerResponseList.add(new CustomerResponse(customer.getFirstName(),customer.getLastName()));
        }

        return customerResponseList;
    }

}