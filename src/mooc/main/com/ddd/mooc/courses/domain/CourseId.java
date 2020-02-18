package com.ddd.mooc.courses.domain;

import com.ddd.apps.shared.domain.Identifier;

import java.io.Serializable;

/**
 * This is a kind of value object that only represents an identifier.
 */
public final class CourseId extends Identifier implements Serializable {

    public CourseId(String value) {
        super(value);
    }

    public CourseId() {
        super ("");
    }
}
