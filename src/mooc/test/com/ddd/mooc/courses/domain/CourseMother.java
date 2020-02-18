package com.ddd.mooc.courses.domain;

/**
 * This class allow ud to wrap the complexity of create a instance of {@link CourseName}, Factory.
 */
public final class CourseMother {

    private CourseId id;
    private CourseName name;
    private CourseDuration duration;

    public static Course create(CourseId id, CourseName name, CourseDuration duration) {
        return new Course(id,name, duration);
    }

    public static Course fromRequest(CreateCourseRequest request) {
        return create(
                CourseIdMother.create(request.getId()),
                CourseNameMother.create(request.getName()),
                CourseDurationMother.create(request.getDuration())
        );
    }


    public static Course random() {
        return create(
                CourseIdMother.random(),
                CourseNameMother.random(),
                CourseDurationMother.random()
        );
    }

}