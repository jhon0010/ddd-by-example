package com.ddd.video.example.apps.mooc.courses.domain;

import com.ddd.video.example.apps.shared.domain.WordMother;

/**
 * This class allow ud to wrap the complexity of create a instance of {@link CourseName}, Factory.
 */
public class CourseNameMother {

    public static CourseName create(String name) {
        return new CourseName(name);
    }

    public static CourseName random() {
        return new CourseName(WordMother.randomName());
    }

}