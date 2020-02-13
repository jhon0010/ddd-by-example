package com.ddd.video.example.apps.mooc.controllers.courses;

import com.ddd.video.example.apps.mooc.courses.application.create.CourseCreator;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public final class CoursesPutController {

    private final CourseCreator creator;

    public CoursesPutController(CourseCreator creator) {
        this.creator = creator;
    }

    @PutMapping("/courses/{id}")
    public ResponseEntity create(@PathVariable String id, @RequestBody Request request) {

        creator.create(id, request.getName(), request.getDuration());
        return new ResponseEntity(HttpStatus.CREATED);
    }
}

/**
 * The getters and setters is bc spring
 * boot use it for serialization
 */
final class Request{

    private String name;
    private String duration;

    public Request() {
    }

    public Request(String name, String duration) {
        this.name = name;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
