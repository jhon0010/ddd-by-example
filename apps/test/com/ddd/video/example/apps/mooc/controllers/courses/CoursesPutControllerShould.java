package com.ddd.video.example.apps.mooc.controllers.courses;

import com.ddd.video.example.apps.mooc.controllers.RequestTestCase;
import org.junit.jupiter.api.Test;

final class CoursesPutControllerShould extends RequestTestCase {

    private final String body = "{\"name\":\"the\",\"duration\":\"5 hours\"}";

    @Test
    public void createValidCourse()  {
        try {
            putRequest("/courses/02ac0c8c-e27c-445f-b97d-7e93d8ca565a", body,201);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
