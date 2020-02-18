package com.ddd.mooc.controllers.healthcheck;

import com.ddd.mooc.controllers.RequestTestCase;
import org.junit.jupiter.api.Test;

final class HealthCheckGetControllerTest extends RequestTestCase {

    @Test
    void testHealthCheck() throws Exception {

        getRequest("/health-check", 200,"{'status':'ok'}");
    }
}