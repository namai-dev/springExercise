package com.example.mycode.student;


import javax.persistence.*;
import java.util.Objects;

@Entity
@Table
public class Student {

    @Id
    @SequenceGenerator(
            name = "student_gen",
            sequenceName = "student_gen",
            allocationSize = 1
    )
    @GeneratedValue(
            generator = "student_gen",
            strategy = GenerationType.SEQUENCE
    )
    private Long id;
    private String firstName;
    private String lastName;
    private String studentId;
    private String email;
    private String yearOfStudy;

    public Student() {
    }

    public Student(Long id, String firstName, String lastName, String studentId, String email, String yearOfStudy) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentId = studentId;
        this.email = email;
        this.yearOfStudy = yearOfStudy;
    }

    public Student(String firstName, String lastName, String studentId, String email, String yearOfStudy) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentId = studentId;
        this.email = email;
        this.yearOfStudy = yearOfStudy;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(String yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id) && Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName) && Objects.equals(studentId, student.studentId) && Objects.equals(email, student.email) && Objects.equals(yearOfStudy, student.yearOfStudy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, studentId, email, yearOfStudy);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", studentId='" + studentId + '\'' +
                ", email='" + email + '\'' +
                ", yearOfStudy='" + yearOfStudy + '\'' +
                '}';
    }
}
