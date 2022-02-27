package com.company;

public abstract class Phone implements Printable {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Phone (String name) {
        this.name = name;
    }
}
