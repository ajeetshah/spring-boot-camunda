package com.example.demo.process;

import org.camunda.bpm.engine.ProcessEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/process")
public class ProcessController {

    @Autowired
    CamundaService camundaService;

    @Autowired
    ProcessEngine processEngine;

    @GetMapping("/start/business/{businessKey}/{shouldVerifyDocuments}")
    public String startProcess(@PathVariable("businessKey") Integer businessKey, @PathVariable("shouldVerifyDocuments") Boolean shouldVerifyDocuments){
        camundaService.startProcess(businessKey, shouldVerifyDocuments);
        String message = "Starting a process with businessKey: " + businessKey;
        System.out.println(message);
        return message;
    }

    @GetMapping("/complete/tasks/{taskId}")
    public String completeTask(@PathVariable("taskId") String taskId) {
        processEngine.getTaskService().complete(taskId);
        String message = "Completed the task: " + taskId;
        System.out.println(message);
        return message;
    }

}