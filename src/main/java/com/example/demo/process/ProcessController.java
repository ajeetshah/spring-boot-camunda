package com.example.demo.process;

import com.example.demo.customer.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/process")
public class ProcessController {
    @Autowired
    CustomerRepository repository;

    @GetMapping("/start")
    public String startProcess(){
        String message = "Starting the process";
        System.out.println(message);
        return message;
        // todo: start a process from here
    }

}