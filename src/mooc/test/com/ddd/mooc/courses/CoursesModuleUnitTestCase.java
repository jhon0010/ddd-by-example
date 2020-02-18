package com.ddd.mooc.courses;

import com.ddd.mooc.courses.infrastructure.persistence.MySqlCourseRepository;
import com.ddd.mooc.courses.domain.CourseRepository;
import com.ddd.apps.shared.UnitTestCase;
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
