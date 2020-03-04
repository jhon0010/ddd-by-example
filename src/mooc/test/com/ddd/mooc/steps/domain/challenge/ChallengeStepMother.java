package com.ddd.mooc.steps.domain.challenge;


import com.ddd.mooc.steps.domain.StepId;
import com.ddd.mooc.steps.domain.StepIdMother;
import com.ddd.mooc.steps.domain.StepTitle;
import com.ddd.mooc.steps.domain.StepTitleMother;

public final class ChallengeStepMother {
    public static ChallengeStep create(StepId id, StepTitle title, ChallengeStepStatement statement) {
        return new ChallengeStep(id, title, statement);
    }

    public static ChallengeStep random() {
        return create(StepIdMother.random(), StepTitleMother.random(), ChallengeStepStatementMother.random());
    }
}
