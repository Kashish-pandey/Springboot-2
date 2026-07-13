package com.kashish.demo;

public class Student {
    private String name;
    private int roll;

    public void setStudent(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    public String getName() {
        return this.name;
    }

    public int getRoll() {
        return this.roll;
    }
}