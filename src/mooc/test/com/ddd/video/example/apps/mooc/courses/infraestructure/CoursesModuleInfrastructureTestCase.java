package com.ddd.video.example.apps.mooc.courses.infraestructure;

import com.ddd.video.example.apps.mooc.courses.infraestructure.persistence.InMemoryRepository;
import com.ddd.video.example.apps.shared.infraestructure.InfrastructureTestCase;
import org.springframework.beans.factory.annotation.Autowired;

public class CoursesModuleInfrastructureTestCase extends InfrastructureTestCase {

    @Autowired
    protected InMemoryRepository repository;

}
