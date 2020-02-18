package com.ddd.video.example.apps.mooc.courses.application.create;

import com.ddd.video.example.apps.mooc.courses.CoursesModuleUnitTestCase;
import com.ddd.video.example.apps.mooc.courses.domain.CreateCourseRequest;
import com.ddd.video.example.apps.mooc.courses.domain.CreateCourseRequestMother;
import org.junit.jupiter.api.Test;


final class CourseCreatorShould extends CoursesModuleUnitTestCase {

    /**
     * Test in calling methods and pass messages.
     *
     * If don't throw exceptions we suppose that the behaviour is good.
     */
    @Test
    void create() {

        CourseCreator creator = new CourseCreator(courseRepository);
        CreateCourseRequest createCourseRequest = CreateCourseRequestMother.random();
        creator.create(createCourseRequest);
        this.shouldHaveSaved();
    }
}