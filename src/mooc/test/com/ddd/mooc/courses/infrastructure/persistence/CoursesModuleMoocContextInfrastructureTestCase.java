package com.ddd.mooc.courses.infrastructure.persistence;

import com.ddd.apps.shared.infraestructure.MoocContextInfrastructureTestCase;
import com.ddd.mooc.courses.domain.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class CoursesModuleMoocContextInfrastructureTestCase extends MoocContextInfrastructureTestCase {

    protected CourseRepository repository = new InMemoryCourseRepository();

    /**
     * The autowired annotation only knows inject it by interface.
     */
    @Autowired
    protected CourseRepository mySqlCourseRepository;
}
