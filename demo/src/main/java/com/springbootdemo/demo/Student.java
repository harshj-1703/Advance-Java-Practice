package com.springbootdemo.demo;

public class Student implements Person {
    private int id;
    private String name;
    private int sem;

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

    public int getSem() {
        return sem;
    }

    public void setSem(int sem) {
        this.sem = sem;
    }

    @Override
    public String display() {
        return "from student : ";// + this.getId() + " " + this.getName() + " " + this.getSem();
    }
}
