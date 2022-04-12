package com.example.demo.process;

import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CamundaService {

    @Autowired
    RuntimeService runtimeService;

    @Value("${process.definition.key}")
    private String processDefKey;

    public ProcessInstance startProcess(Integer businessKey) {
        final Map<String, Object> variables = new HashMap<>();
        return runtimeService
                .createProcessInstanceByKey(processDefKey)
                .businessKey(businessKey.toString())
                .setVariables(variables)
                .execute();
    }
}
