package com.company;

public class Iphone extends Phone{
    private String version;
    private int price;
    private int volume;
    public Iphone(String name, String version, int price, int volume) {
        super(name);
        this.version = version;
        this.price = price;
        this.volume = volume;
    }

    @Override
    public void print() {
        System.out.println("Version:"+ version
        +"\nPrice:"+ price
        +"\nVolume" + volume);
    }
}
