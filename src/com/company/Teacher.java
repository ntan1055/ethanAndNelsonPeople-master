package com.company;

public abstract class Teacher extends Person
{
    private String subject;
    private String title;
    private String firstName;
    private String familyName;
    public Teacher(String subject, String title, String firstName, String familyName)
    {
        super(" ", " ");
        this.subject = subject;
        this.title = title;
        this.firstName = firstName;
        this.familyName = familyName;
    }
    public String getSubject()
    {
        return subject;
    }
}
