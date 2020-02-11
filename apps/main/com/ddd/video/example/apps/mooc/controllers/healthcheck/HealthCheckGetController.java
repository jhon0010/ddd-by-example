package com.ddd.video.example.apps.mooc.controllers.healthcheck;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * 1. The controllers are naming by the communication protocol for example GET http
 * 2. The controller layer belongs to the infrastructure layer.
 *      For this reason doesn't matter the coupling with the framework.
 * 3. From here we can access to the application layer.
 * 4. One class per verb (PUT, POST, GET , DELETE) better cohesion
 */
@RestController
public final class HealthCheckGetController {

    /**
     * By default spring boot returns json
     * @return
     */
    @GetMapping("/health-check")
    public HashMap<String, String> index() {

        HashMap<String, String> status = new HashMap<>();
        status.put("status", "ok");
        return status;
    }

}
