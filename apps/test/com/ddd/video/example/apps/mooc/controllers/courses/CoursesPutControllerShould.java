package com.ddd.video.example.apps.mooc.controllers.courses;

import com.ddd.video.example.apps.mooc.controllers.RequestTestCase;
import org.junit.jupiter.api.Test;

final class CoursesPutControllerShould extends RequestTestCase {

    private final String body = "{\"name\":\"the\",\"duration\":\"5 hours\"}";

    @Test
    public void createValidCourse() throws Exception {
        putRequest("/courses/201475", body,201);
    }
}
