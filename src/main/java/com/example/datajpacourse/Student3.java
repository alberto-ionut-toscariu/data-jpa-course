package com.example.datajpacourse;

import javax.persistence.*;

import static javax.persistence.GenerationType.SEQUENCE;

/*@Table*/
@Entity(name = "Student3")
@Table(
        name = "Student3",
        uniqueConstraints = {
                @UniqueConstraint(name="student_email_unique",columnNames = "email")
        }
)
public class Student3 {
    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "student_sequence"
    )
    @Column(
            name="id",
            updatable = false
    )
    private Long id;

    @Column(
            name="first_name",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String fristName;

    @Column(
            name="last_name",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String lastName;

    @Column(
            name="email",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String email;

    @Column(
            name="age",
            nullable = false
    )
    private Integer age;

    public Student3(String fristName, String lastName, String email, Integer age) {

        this.fristName = fristName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
    }

    public Student3() {

    }

    @Override
    public String toString() {
        return "Student2{" +
                "id=" + id +
                ", fristName='" + fristName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFristName() {
        return fristName;
    }

    public void setFristName(String fristName) {
        this.fristName = fristName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
