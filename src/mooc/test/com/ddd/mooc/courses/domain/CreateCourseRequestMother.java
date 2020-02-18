package com.ddd.mooc.courses.domain;

/**
 * This class allow ud to wrap the complexity of create a instance of {@link CourseName}, Factory.
 */
public final class CreateCourseRequestMother {

    public static CreateCourseRequest create(String id, String name, String duration) {
        return new CreateCourseRequest(
                CourseIdMother.create(id).getValue(),
                CourseNameMother.create(name).getValue(),
                CourseDurationMother.create(duration).getValue()
        );
    }

    public static CreateCourseRequest random() {

        return create(
                CourseIdMother.random().getValue(),
                CourseNameMother.random().getValue(),
                CourseDurationMother.random().getValue()
        );
    }

}