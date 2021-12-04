package com.pmt.jbpm.controller;

import com.pmt.jbpm.service.ClientJbpmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test-client")
public class ClientJbpmController {

    private final ClientJbpmService clientJbpmService;

    @Autowired
    public ClientJbpmController(ClientJbpmService service) {
        this.clientJbpmService = service;
    }

    @GetMapping("initialize-drools")
    public void initializeDroolsServiceClients() {
        clientJbpmService.initializeDroolsServiceClients();
    }

    @GetMapping("initialize-jbpm")
    public void initializeJbpmServiceClients() {
        clientJbpmService.initializeJbpmServiceClients();
    }

    @GetMapping("initialize-solver")
    public void initializeSolverServiceClients() {
        clientJbpmService.initializeSolverServiceClients();
    }

}
