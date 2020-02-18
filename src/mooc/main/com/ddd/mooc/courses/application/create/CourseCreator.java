package com.ddd.mooc.courses.application.create;

import com.ddd.apps.shared.domain.Service;
import com.ddd.mooc.courses.domain.CourseDuration;
import com.ddd.mooc.courses.domain.CourseName;
import com.ddd.mooc.courses.domain.CourseRepository;
import com.ddd.mooc.courses.domain.CreateCourseRequest;
import com.ddd.mooc.courses.domain.Course;
import com.ddd.mooc.courses.domain.CourseId;

/**
 * The Service should receive scalar variables for been agnostic of the technology.
 *
 * The other alternative is to receive the own POJO or DTO as well.
 *
 * Never use as argument or return an framework class.
 */
@Service
public final class CourseCreator {

    private final CourseRepository courseRepository;

    public CourseCreator(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    /**
     * Receives the arguments with primitives or scalars for be agnostic to the implementation.
     */
    public void create(CreateCourseRequest request) {
        Course course = new Course(new CourseId(request.getId()),
                new CourseName(request.getName()),
                new CourseDuration(request.getDuration()));
        courseRepository.save(course);
    }
}
