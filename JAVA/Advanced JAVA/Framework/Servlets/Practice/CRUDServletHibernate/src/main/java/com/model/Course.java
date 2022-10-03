package com.model;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;

@Entity()
@Table(name = "Student_Courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Course_id")
    int courseId;
    @Column(name = "Course_name")
    String courseName;

    @JoinColumn(name = "Student_id")


    @OneToOne(mappedBy = "course")
    Student student;


    public Course(int courseId, String courseName, Student student) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.student = student;
    }

    public Course(int courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }


    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Course() {
    }
}
