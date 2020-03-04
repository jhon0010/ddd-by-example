package com.ddd.mooc.steps;

import com.ddd.apps.shared.infraestructure.MoocContextInfrastructureTestCase;
import com.ddd.mooc.steps.domain.StepRepository;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class StepsModuleInfrastructureTestCase extends MoocContextInfrastructureTestCase {
    @Autowired
    protected StepRepository repository;
}
