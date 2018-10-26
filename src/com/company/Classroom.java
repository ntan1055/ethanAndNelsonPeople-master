package com.company;

public class Classroom {
  Student[] student;
  Teacher teacher;
  public Classroom(Student[] student, Teacher teacher)
  {
      this.student = student;
      this.teacher = teacher;
  }
  public String getSubject()
  {
      return this.teacher.getSubject();
  }
}
