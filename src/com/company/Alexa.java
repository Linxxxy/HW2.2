package com.company;

public class Alexa extends Person{
    private String name;

     public Alexa(String name, String name1) {
        super(name);
        this.name = name1;
    }

    public Alexa(String name) {
        super(name);

    }
    @Override
    public void print() {
        System.out.println();
}}
