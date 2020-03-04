package com.ddd.mooc.steps.domain.video;

import com.ddd.apps.shared.domain.VideoUrl;
import com.ddd.apps.shared.domain.VideoUrlMother;
import com.ddd.mooc.steps.domain.StepId;
import com.ddd.mooc.steps.domain.StepIdMother;
import com.ddd.mooc.steps.domain.StepTitle;
import com.ddd.mooc.steps.domain.StepTitleMother;

public final class VideoStepMother {
    public static VideoStep create(StepId id, StepTitle title, VideoUrl videoUrl, VideoStepText text) {
        return new VideoStep(id, title, videoUrl, text);
    }

    public static VideoStep random() {
        return create(
            StepIdMother.random(),
            StepTitleMother.random(),
            VideoUrlMother.random(),
            VideoStepTextMother.random()
        );
    }
}
