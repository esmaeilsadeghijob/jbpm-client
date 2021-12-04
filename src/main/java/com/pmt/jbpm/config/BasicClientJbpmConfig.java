package com.pmt.jbpm.config;

import org.kie.server.api.marshalling.MarshallingFormat;
import org.kie.server.client.KieServicesClient;
import org.kie.server.client.KieServicesConfiguration;
import org.kie.server.client.KieServicesFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BasicClientJbpmConfig {

    @Value("${jbpm.server.url}")
    private String URL;
    @Value("${jbpm.server.username}")
    private String USER;
    @Value("${jbpm.server.password}")
    private String PASSWORD;
    private KieServicesConfiguration conf;

    @Bean
    public KieServicesClient initializeKieServerClient() {
        KieServicesConfiguration conf = KieServicesFactory.newRestConfiguration(URL, USER, PASSWORD);
        MarshallingFormat FORMAT = MarshallingFormat.JSON;
        conf.setMarshallingFormat(FORMAT);
        return KieServicesFactory.newKieServicesClient(conf);
    }

}
