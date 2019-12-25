package com.pulgupta.demo.config.rule.engine;

import io.micronaut.context.annotation.Factory;
import org.drools.decisiontable.DecisionTableProviderImpl;
import org.kie.api.KieServices;
import org.kie.api.builder.KieBuilder;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.builder.KieModule;
import org.kie.api.runtime.KieContainer;
import org.kie.internal.io.ResourceFactory;

import javax.inject.Singleton;

@Factory
public class DroolsConfig {

    private static final String drlFile = "rules/authorization.xls";

    @Singleton
    public KieContainer kieContainer() {
        KieServices kieServices = KieServices.Factory.get();

        DecisionTableProviderImpl decisionTableProvider = new DecisionTableProviderImpl();
        String drl = decisionTableProvider.loadFromResource(ResourceFactory.newClassPathResource(drlFile), null);

        KieFileSystem kieFileSystem = kieServices.newKieFileSystem();
        kieFileSystem.write(ResourceFactory.newClassPathResource(drlFile));
        KieBuilder kieBuilder = kieServices.newKieBuilder(kieFileSystem);
        kieBuilder.buildAll();
        KieModule kieModule = kieBuilder.getKieModule();

        return kieServices.newKieContainer(kieModule.getReleaseId());
    }
}