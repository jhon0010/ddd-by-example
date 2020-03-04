package com.ddd.mooc.steps.domain;


import com.ddd.apps.shared.domain.UuidMother;

public final class StepIdMother {
    public static StepId create(String value) {
        return new StepId(value);
    }

    public static StepId random() {
        return create(UuidMother.random());
    }
}
