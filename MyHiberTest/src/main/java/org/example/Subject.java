package org.example;

import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;

@Entity
@Table(name="subject_details")
public class Subject {
    @Id
    @Column(name="sub_id")
    private int id;
    @Column(name="sub_name",length = 50)
    private String name;
    @Column(name="subject_duration", length = 10)
    private String duration;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @OneToOne
    private Student student;

    public Subject() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
