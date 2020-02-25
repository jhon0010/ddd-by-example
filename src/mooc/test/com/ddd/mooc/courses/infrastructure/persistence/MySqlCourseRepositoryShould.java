package com.ddd.mooc.courses.infrastructure.persistence;

import com.ddd.apps.shared.domain.WordMother;
import com.ddd.mooc.courses.domain.Course;
import com.ddd.mooc.courses.domain.CourseId;
import com.ddd.mooc.courses.domain.CourseMother;
import com.ddd.mooc.courses.domain.CourseRepository;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.transaction.Transactional;
import java.util.Optional;

/**
 * The Transactional annotation clean the data used in the test after its done.
 * FOr each test execute a transaction at the end of the test execute a rollback
 * Better performance that truncate.
 */
@Transactional
class MySqlCourseRepositoryShould extends CoursesModuleMoocContextInfrastructureTestCase {

    Course course;

    @BeforeEach
    void setUp() {
        course = CourseMother.random();

    }

    @Test
    void save() {
        mySqlCourseRepository.save(course);
    }

    @Test
    void get() {

        Course foundCourse = CourseMother.random();
        mySqlCourseRepository.save(foundCourse);
        Optional<Course> foundedCourse = mySqlCourseRepository.get(foundCourse.getId());
        Assert.assertEquals(foundCourse, foundedCourse.get());
    }

    @Test
    void getFailed() {
        Optional<Course> foundedCourse = mySqlCourseRepository.get(new CourseId(WordMother.randomId()));
        Assert.assertFalse("The course found is different", foundedCourse.isPresent());
    }
}