package com.ddd.video.example.apps.mooc.courses.domain;

import com.ddd.video.example.apps.shared.domain.WordMother;

/**
 * This class allow ud to wrap the complexity of create a instance of {@link CourseName}, Factory.
 */
public class CourseDurationMother {

    public static CourseDurantion create(String value) {
        return new CourseDurantion(value);
    }

    public static CourseDurantion random() {
        return new CourseDurantion(WordMother.randomDuration());
    }

}