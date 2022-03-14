package com.example.webservice;

public class Course {
    private String name;
    private String teacher;
    private int points;

    public Course(){

    }

    public Course(String name, String teacher, int points) {
        this.name = name;
        this.teacher = teacher;
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
