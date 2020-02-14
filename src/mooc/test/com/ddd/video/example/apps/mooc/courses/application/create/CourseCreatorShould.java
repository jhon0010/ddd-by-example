package com.ddd.video.example.apps.mooc.courses.application.create;

import com.ddd.video.example.apps.mooc.courses.CoursesModuleUnitTestCase;
import com.ddd.video.example.apps.mooc.courses.domain.Course;
import com.ddd.video.example.apps.mooc.courses.domain.CreateCourseRequest;
import com.ddd.video.example.apps.mooc.courses.domain.CourseMother;
import com.ddd.video.example.apps.mooc.courses.domain.CourseRepository;
import com.ddd.video.example.apps.mooc.courses.domain.CreateCourseRequestMother;
import com.ddd.video.example.apps.mooc.courses.infraestructure.InMemoryRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;


final class CourseCreatorShould extends CoursesModuleUnitTestCase {

    /**
     * Test in calling methods and pass messages.
     *
     * If don't throw exceptions we suppose that the behaviour is good.
     */
    @Test
    void create() {

        CourseRepository courseRepository = Mockito.mock(InMemoryRepository.class); // Injected mock instance
        CourseCreator creator = new CourseCreator(courseRepository);
        CreateCourseRequest createCourseRequest = CreateCourseRequestMother.random();
        creator.create(createCourseRequest);
        verify(courseRepository, atLeastOnce()).save(any()); // Verifying the call of repository method, the method have to have the same object (override toString and hashCode())
    }
}