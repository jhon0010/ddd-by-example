package com.ddd.video.example.apps.mooc.courses;

import com.ddd.video.example.apps.mooc.courses.domain.Course;
import com.ddd.video.example.apps.mooc.courses.domain.CourseRepository;
import com.ddd.video.example.apps.mooc.courses.infraestructure.persistence.MySqlCourseRepository;
import com.ddd.video.example.apps.shared.UnitTestCase;
import org.junit.jupiter.api.BeforeEach;
import static org.mockito.Mockito.*;

/**
 * Common class that allow ud to test the common cases for example the interaction with the repository.
 *
 * Remember that th
 */
public class CoursesModuleUnitTestCase extends UnitTestCase {

    protected CourseRepository courseRepository;

    /**
     * Always have a fresh instance of the repository.
     */
    @BeforeEach
    protected void setUp() {
        courseRepository = mock(MySqlCourseRepository.class);
    }


    public void shouldHaveSaved() {
        verify(courseRepository, atLeastOnce()).save(any());
    }

}
