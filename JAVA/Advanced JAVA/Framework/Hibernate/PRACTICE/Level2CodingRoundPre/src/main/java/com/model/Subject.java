package com.model;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "Subjects_information")
public class Subject {
    @Column(name = "Subject_id")
    @Id
    int subjectId;
    @Column(name = "Student_Name")
    String subjectName;
    @Column(name = "Students")
    @ManyToMany(cascade = CascadeType.ALL)
    List<Student> students;

    public List<StudentMarks> getMarks() {
        return marks;
    }

    public void setMarks(List<StudentMarks> marks) {
        this.marks = marks;
    }

    @ManyToMany(cascade = CascadeType.ALL)
    List<StudentMarks> marks;
    public Subject(int subjectId, String subjectName) {
        this.subjectId = subjectId;
        this.subjectName = subjectName;
    }

    public Subject() {
    }

    public int getSubjectId() {
        return subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }


    @Override
    public String toString() {
        return "Subject{" +
                "subjectId=" + subjectId +
                ", subjectName='" + subjectName + '\'' +
                ", students=" + students +
                '}';
    }
}
