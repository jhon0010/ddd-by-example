package com.ddd.mooc.steps.domain.video;


import com.ddd.apps.shared.domain.WordMother;

public final class VideoStepTextMother {
    public static VideoStepText create(String value) {
        return new VideoStepText(value);
    }

    public static VideoStepText random() {
        return create(WordMother.randomName());
    }
}
