package com.ddd.mooc.courses.domain;

import com.ddd.apps.shared.domain.StringValueObject;

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
