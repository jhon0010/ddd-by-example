package com.ddd.video.example.apps.mooc.courses.infraestructure;

import com.ddd.video.example.apps.mooc.courses.domain.Course;
import com.ddd.video.example.apps.mooc.courses.domain.CourseRepository;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.mockito.Mockito.*;

/**
 * In this kind of tests ("Integration") you don't need to mock anything bc you have to tests the real implementation
 */
final class InMemoryRepositoryShould {

    CourseRepository repository;
    Course course;

    @BeforeEach
    void setUp() {
        repository = new InMemoryRepository();
        course  = new Course("1","the", "5 hours");
    }

    @Test
    void save() {
        repository.save(course);
    }

    @Test
    void get() {
        repository.save(course);
        Optional<Course> foundCourse = repository.get(course.getId());
        Assert.assertEquals(course, foundCourse.get());
    }

    @Test
    void getFailed() {
        Optional<Course> foundCourse = repository.get("non-exist-id");
        Assert.assertFalse("The course found is different", foundCourse.isPresent());
    }

    @Test
    void delete() {
    }
}