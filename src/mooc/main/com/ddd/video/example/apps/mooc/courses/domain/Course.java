package com.ddd.video.example.apps.mooc.courses.domain;

import java.util.Objects;

public class Course {

    private String id;
    private String name;
    private String duration;

    public Course(String id, String name, String duration) {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
