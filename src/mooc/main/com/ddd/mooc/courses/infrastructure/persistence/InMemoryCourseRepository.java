package com.ddd.mooc.courses.infrastructure.persistence;

import com.ddd.mooc.courses.domain.Course;
import com.ddd.mooc.courses.domain.CourseId;
import com.ddd.mooc.courses.domain.CourseRepository;

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
public class InMemoryCourseRepository implements CourseRepository{

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

