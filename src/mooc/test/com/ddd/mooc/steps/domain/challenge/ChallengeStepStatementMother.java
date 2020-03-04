package com.ddd.mooc.steps.domain.challenge;

import com.ddd.apps.shared.domain.WordMother;

public final class ChallengeStepStatementMother {
    public static ChallengeStepStatement create(String value) {
        return new ChallengeStepStatement(value);
    }

    public static ChallengeStepStatement random() {
        return create(WordMother.randomName());
    }
}
