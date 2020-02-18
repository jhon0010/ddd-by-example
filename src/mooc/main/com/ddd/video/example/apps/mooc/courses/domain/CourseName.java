package com.ddd.video.example.apps.mooc.courses.domain;

import com.ddd.video.example.apps.shared.domain.StringValueObject;

public class CourseName extends StringValueObject {

    public CourseName(String value) {
        super(value);
    }

    /**
     * This is necessary for hibernate working , this is a lake of infrastructure layer in domain layer.
     */
    public CourseName() {
        super("null");
    }
}
