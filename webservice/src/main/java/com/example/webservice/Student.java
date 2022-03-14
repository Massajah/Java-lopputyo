package com.example.webservice;

public class Student {
    public int id;
    private String fname;
    private String lname;
    private String sClass;

    private static int count = 0;

    public Student(){

    }

    public Student(String fname, String lname, String sClass) {
        this.fname = fname;
        this.lname = lname;
        this.sClass = sClass;
        this.id = count++;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getsClass() {
        return sClass;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setsClass(String sClass) {
        this.sClass = sClass;
    }

    public int getId() {
        return id;
    }
}
