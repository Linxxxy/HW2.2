package com.company;

public abstract class Person implements Printable{
private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Person(String name) {
        this.name = name;
    }

}
