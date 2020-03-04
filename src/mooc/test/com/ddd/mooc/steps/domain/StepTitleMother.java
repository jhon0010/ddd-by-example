package com.ddd.mooc.steps.domain;


import com.ddd.apps.shared.domain.WordMother;

public final class StepTitleMother {
    public static StepTitle create(String value) {
        return new StepTitle(value);
    }

    public static StepTitle random() {
        return create(WordMother.randomName());
    }
}
