package com.ddd.video.example.apps.mooc.courses.application.create;

import com.ddd.video.example.apps.mooc.courses.domain.Course;
import com.ddd.video.example.apps.mooc.courses.domain.CourseRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;


final class CourseCreatorShould {

    /**
     * Test in calling methods and pass messages.
     *
     * If don't throw exceptions we suppose that the behaviour is good.
     */
    @Test
    void create() {

        CourseRepository courseRepository = Mockito.mock(CourseRepository.class); // Injected mock instance
        CourseCreator creator = new CourseCreator(courseRepository);
        Course course = new Course("1","the", "5 hours");
        creator.create(course.getId(), course.getName(), course.getDuration());
        verify(courseRepository, atLeastOnce()).save(course); // Verifying the call of repository method, the method have to have the same object (override toString and hashCode())
    }
}