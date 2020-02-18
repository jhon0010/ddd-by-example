package com.ddd.mooc.courses.domain;

public class Course {

    private CourseId id;
    private CourseName name;
    private CourseDuration duration;

    public Course(CourseId id, CourseName name, CourseDuration duration) {
        this.id = id;
        this.name = name;
        this.duration = duration;
    }

    public CourseId getId() {
        return id;
    }

    public void setId(CourseId id) {
        this.id = id;
    }

    public CourseName getName() {
        return name;
    }

    public void setName(CourseName name) {
        this.name = name;
    }

    public CourseDuration getDuration() {
        return duration;
    }

    public void setDuration(CourseDuration duration) {
        this.duration = duration;
    }
}
