package com.ddd.mooc.courses.domain;

import com.ddd.apps.shared.domain.WordMother;

/**
 * This class allow ud to wrap the complexity of create a instance of {@link CourseName}, Factory.
 */
public class CourseIdMother {

    public static CourseId create(String value) {
        return new CourseId(value);
    }

    public static CourseId random() {
        return new CourseId(WordMother.randomId());
    }

}