package com.ddd.mooc.courses.domain;

import java.io.Serializable;
import java.util.Objects;

public class Course implements Serializable {

    private CourseId id;
    private CourseName name;
    private CourseDuration duration;

    public Course() {
    }

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

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name=" + name +
                ", duration=" + duration +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(getId(), course.getId()) &&
                Objects.equals(getName(), course.getName()) &&
                Objects.equals(getDuration(), course.getDuration());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getDuration());
    }
}
