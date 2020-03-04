package com.ddd.mooc.steps.domain;


import com.ddd.apps.shared.domain.StringValueObject;

public final class StepTitle extends StringValueObject {
    public StepTitle(String value) {
        super(value);
    }

    private StepTitle() {
        super(null);
    }
}
