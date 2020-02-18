package com.ddd.mooc.courses.domain;

import com.ddd.apps.shared.domain.WordMother;

/**
 * This class allow ud to wrap the complexity of create a instance of {@link CourseName}, Factory.
 */
public class CourseDurationMother {

    public static CourseDuration create(String value) {
        return new CourseDuration(value);
    }

    public static CourseDuration random() {
        return new CourseDuration(WordMother.randomDuration());
    }

}