package com.company;

public abstract class Student extends Person {
    private double GPA;
    private int gradeLevel;
    private double weight;
    public Student(double GPA, int gradeLevel, double weight)
    {
        super(" "," ");
        this.GPA = GPA;
        this.gradeLevel = gradeLevel;
        this.weight = weight;
    }

}
