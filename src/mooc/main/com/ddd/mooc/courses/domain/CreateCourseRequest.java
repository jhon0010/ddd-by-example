package com.ddd.mooc.courses.domain;

/**
 * The getters and setters is bc spring
 * boot use it for serialization
 */
public final class CreateCourseRequest {

    private String id;
    private String name;
    private String duration;

    public CreateCourseRequest() {
    }

    public CreateCourseRequest(String id, String name, String duration) {
        this.id = id;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
