package com.ddd.video.example.apps.mooc.courses.domain;

import com.ddd.video.example.apps.shared.domain.Identifier;

/**
 * This is a kind of value object that only represents an identifier.
 */
public final class CourseId extends Identifier {

    public CourseId(String value) {
        super(value);
    }

}
