package com.ddd.mooc.steps.persistence;

import com.ddd.mooc.steps.StepsModuleInfrastructureTestCase;
import com.ddd.mooc.steps.domain.Step;
import static org.junit.Assert.*;

import com.ddd.mooc.steps.domain.StepIdMother;
import com.ddd.mooc.steps.domain.challenge.ChallengeStepMother;
import com.ddd.mooc.steps.domain.video.VideoStepMother;
import org.junit.jupiter.api.Test;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Transactional
class MySqlStepRepositoryShould extends StepsModuleInfrastructureTestCase {
    @Test
    void save_a_step() {
        for (Step step : steps()) {
            repository.save(step);
        }
    }

    @Test
    void return_an_existing_step() {
        for (Step step : steps()) {
            repository.save(step);

            assertEquals(Optional.of(step), repository.search(step.id()));
        }
    }

    @Test
    void not_return_a_non_existing_course() {
        assertFalse(repository.search(StepIdMother.random()).isPresent());
    }

    private List<? extends Step> steps() {
        return Arrays.asList(ChallengeStepMother.random(), VideoStepMother.random());
    }
}
