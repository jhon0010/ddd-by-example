package com.ddd.video.example.apps.mooc.controllers.healthcheck;

import com.ddd.video.example.apps.mooc.controllers.RequestTestCase;
import org.junit.jupiter.api.Test;

final class HealthCheckGetControllerTest extends RequestTestCase {

    @Test
    void testHealthCheck() throws Exception {

        getRequest("/health-check", 200,"{'status':'ok'}");
    }
}