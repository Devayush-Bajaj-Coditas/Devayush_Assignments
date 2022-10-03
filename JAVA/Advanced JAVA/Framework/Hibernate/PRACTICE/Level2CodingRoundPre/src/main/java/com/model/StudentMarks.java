package com.model;

import javax.persistence.*;

@Entity
@Table (name = "Students_marks")
public class StudentMarks {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int marksId;
    int studentId;
    int subjectId;
    float marks;

    public StudentMarks() {
    }

    public StudentMarks(int studentId, int subjectId, float marks) {
        this.studentId = studentId;
        this.subjectId = subjectId;
        this.marks = marks;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public float getMarks() {
        return marks;
    }
}
