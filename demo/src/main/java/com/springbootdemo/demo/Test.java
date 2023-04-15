package com.springbootdemo.demo;

import org.springframework.stereotype.Component;

@Component
public class Test {
    private Person p;

    public Test(Person p) {
        this.p = p;
    }

    public Test() {
    }

    public Person getP() {
        return p;
    }

    public void setP(Person p) {
        this.p = p;
    }

    public String displayInfo() {
        return p.display();
    }
}
