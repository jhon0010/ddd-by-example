package com.ddd.mooc.controllers.courses;

import com.ddd.mooc.courses.domain.CreateCourseRequest;
import com.ddd.mooc.courses.application.create.CourseCreator;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RestController
public final class CoursesPutController {

    private final CourseCreator creator;

    public CoursesPutController(CourseCreator creator) {
        this.creator = creator;
    }

    /**
     * This body is casting to a Request object thanks to Spring.
     * @param id
     * @param request
     * @return
     */
    @PutMapping("/courses/{id}")
    public ResponseEntity<String> create(@PathVariable String id, @RequestBody Request request) {

        creator.create(new CreateCourseRequest(id, request.getName(), request.getDuration()));
        return new ResponseEntity(HttpStatus.CREATED);
    }

    /**
     * Created for avoid dependencies of framework.
     */
    static final class Request {

        private String name;
        private String duration;

        public Request() {
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

}

