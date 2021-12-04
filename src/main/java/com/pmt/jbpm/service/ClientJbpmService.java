package com.pmt.jbpm.service;

import org.kie.server.client.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientJbpmService {

    @Autowired
    private KieServicesClient kieServicesClient;
    private RuleServicesClient ruleClient;
    private DMNServicesClient dmnClient;
    private CaseServicesClient caseClient;
    private DocumentServicesClient documentClient;
    private JobServicesClient jobClient;
    private ProcessServicesClient processClient;
    private QueryServicesClient queryClient;
    private UIServicesClient uiClient;
    private UserTaskServicesClient userTaskClient;
    private SolverServicesClient solverClient;

    public void initializeDroolsServiceClients() {
        ruleClient = kieServicesClient.getServicesClient(RuleServicesClient.class);
        dmnClient = kieServicesClient.getServicesClient(DMNServicesClient.class);
    }

    public void initializeJbpmServiceClients() {
        caseClient = kieServicesClient.getServicesClient(CaseServicesClient.class);
        documentClient = kieServicesClient.getServicesClient(DocumentServicesClient.class);
        jobClient = kieServicesClient.getServicesClient(JobServicesClient.class);
        processClient = kieServicesClient.getServicesClient(ProcessServicesClient.class);
        queryClient = kieServicesClient.getServicesClient(QueryServicesClient.class);
        uiClient = kieServicesClient.getServicesClient(UIServicesClient.class);
        userTaskClient = kieServicesClient.getServicesClient(UserTaskServicesClient.class);
    }

    public void initializeSolverServiceClients() {
        solverClient = kieServicesClient.getServicesClient(SolverServicesClient.class);
    }
}
