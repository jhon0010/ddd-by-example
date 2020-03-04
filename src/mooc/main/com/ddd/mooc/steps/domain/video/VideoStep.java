package com.ddd.mooc.steps.domain.video;

import com.ddd.apps.shared.domain.VideoUrl;
import com.ddd.mooc.steps.domain.Step;
import com.ddd.mooc.steps.domain.StepId;
import com.ddd.mooc.steps.domain.StepTitle;

public final class VideoStep extends Step {
    private final VideoUrl videoUrl;
    private final VideoStepText text;

    public VideoStep(StepId id, StepTitle title, VideoUrl videoUrl, VideoStepText text) {
        super(id, title);

        this.videoUrl = videoUrl;
        this.text     = text;
    }

    private VideoStep() {
        super(null, null);

        this.videoUrl = null;
        this.text     = null;
    }
}
