package com.ddd.video.example.apps.mooc.courses.application.create;

import com.ddd.video.example.apps.mooc.courses.domain.Course;
import com.ddd.video.example.apps.mooc.courses.domain.CreateCourseRequest;
import com.ddd.video.example.apps.mooc.courses.domain.CourseDurantion;
import com.ddd.video.example.apps.mooc.courses.domain.CourseId;
import com.ddd.video.example.apps.mooc.courses.domain.CourseName;
import com.ddd.video.example.apps.mooc.courses.domain.CourseRepository;
import org.springframework.stereotype.Service;

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
                new CourseDurantion(request.getDuration()));
        courseRepository.save(course);
    }
}
