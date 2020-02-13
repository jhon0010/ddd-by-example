package com.ddd.video.example.apps.mooc.courses.application.create;

import com.ddd.video.example.apps.mooc.courses.domain.Course;
import com.ddd.video.example.apps.mooc.courses.domain.CourseRepository;
import org.springframework.stereotype.Service;

@Service
public final class CourseCreator {

    private final CourseRepository courseRepository;

    public CourseCreator(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    /**
     * Receives the arguments with primitives or scalars for be agnostic to the implementation.
     *
     * @param id
     * @param name
     * @param duration
     */
    public void create(String id, String name , String duration) {
        Course course = new Course(id, name, duration);
        courseRepository.save(course);
    }
}
