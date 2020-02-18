package com.ddd.video.example.apps.mooc.courses.infraestructure.persistence;

import com.ddd.video.example.apps.mooc.courses.domain.Course;
import com.ddd.video.example.apps.mooc.courses.domain.CourseId;
import com.ddd.video.example.apps.mooc.courses.domain.CourseRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Optional;

/**
 * The classes must be here for :
 *
 *      1. Input output operations.
 *      2. coupled to a vendor.
 *      3. We need to mock this behaviour for unit os service test.
 *
 *  The name of this class indicate this behaviour.
 */
public class InMemoryRepository implements CourseRepository{

    HashMap<CourseId, Course> courses = new HashMap<>();

    @Override
    public void save(Course course) {
        this.courses.put(course.getId(), course);
    }

    @Override
    public Optional<Course> get(String id) {
        return Optional.ofNullable(this.courses.get(new CourseId(id)));
    }

    @Override
    public void delete(String id) {

    }
}

