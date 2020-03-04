package com.ddd.mooc.steps.domain.challenge;


import com.ddd.mooc.steps.domain.Step;
import com.ddd.mooc.steps.domain.StepId;
import com.ddd.mooc.steps.domain.StepTitle;

import java.util.Objects;


/**
 * The difference with normal stetp is the proposal ChallengeStepStatement
 */
public final class ChallengeStep extends Step {

    private final ChallengeStepStatement statement;

    public ChallengeStep(StepId id, StepTitle title, ChallengeStepStatement statement) {
        super(id, title);

        this.statement = statement;
    }

    private ChallengeStep() {
        super(null, null);

        this.statement = null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        ChallengeStep that = (ChallengeStep) o;
        return statement.equals(that.statement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), statement);
    }
}
