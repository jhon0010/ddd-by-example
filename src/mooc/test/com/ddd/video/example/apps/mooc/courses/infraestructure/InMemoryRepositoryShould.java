package com.ddd.video.example.apps.mooc.courses.infraestructure;

import com.ddd.video.example.apps.mooc.courses.domain.Course;
import com.ddd.video.example.apps.mooc.courses.domain.CourseDurantion;
import com.ddd.video.example.apps.mooc.courses.domain.CourseId;

import com.ddd.video.example.apps.mooc.courses.domain.CourseMother;
import com.ddd.video.example.apps.mooc.courses.domain.CourseNameMother;
import com.ddd.video.example.apps.mooc.courses.domain.CourseRepository;
import com.ddd.video.example.apps.shared.domain.WordMother;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

/**
 * In this kind of tests ("Integration") you don't need to mock anything bc you have to tests the real implementation
 */
final class InMemoryRepositoryShould {

    CourseRepository repository;
    Course course;
    Course foundCourse;

    @BeforeEach
    void setUp() {
        repository = new InMemoryRepository();
        course  = CourseMother.random();
        foundCourse = CourseMother.random();
    }

    @Test
    void save() {
        repository.save(course);
    }

    @Test
    void get() {
        repository.save(foundCourse);
        Optional<Course> foundedCourse = repository.get(foundCourse.getId().getValue());
        Assert.assertEquals(foundCourse, foundedCourse.get());
    }

    @Test
    void getFailed() {
        Optional<Course> foundedCourse = repository.get(WordMother.randomId());
        Assert.assertFalse("The course found is different", foundedCourse.isPresent());
    }

    @Test
    void delete() {
    }
}