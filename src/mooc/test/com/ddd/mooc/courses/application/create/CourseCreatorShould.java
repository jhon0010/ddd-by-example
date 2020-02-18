package com.ddd.mooc.courses.application.create;

import com.ddd.mooc.courses.domain.CreateCourseRequestMother;
import com.ddd.mooc.courses.CoursesModuleUnitTestCase;
import com.ddd.mooc.courses.domain.CreateCourseRequest;
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