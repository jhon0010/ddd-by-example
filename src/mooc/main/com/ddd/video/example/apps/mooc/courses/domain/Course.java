package com.ddd.video.example.apps.mooc.courses.domain;

public class Course {

    private CourseId id;
    private CourseName name;
    private CourseDurantion duration;

    public Course(CourseId id, CourseName name, CourseDurantion duration) {
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

    public CourseDurantion getDuration() {
        return duration;
    }

    public void setDuration(CourseDurantion duration) {
        this.duration = duration;
    }
}
