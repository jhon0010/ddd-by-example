package com.ddd.mooc.courses.domain;

import java.util.Optional;

/**
 * Avoid to use ICourseRepository or something like I, because this interface belongs to the domain layer.
 */
public interface CourseRepository {

    void save(Course course);
    Optional<Course> get(CourseId id);
}
