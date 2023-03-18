package mytest;/*
To serialize an object means to convert its state to a byte stream so
that the byte stream can be reverted back into a copy of the object.
*/

import java.io.Serializable;

public class User implements Serializable{
    String name;
    int age;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String displayDetails()
    {
        return this.name+ " " + this.age;
    }

}

/*
class Student with enroll,name,roll,div,sem,branch
*/