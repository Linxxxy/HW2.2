package com.company;

public class Lenovo extends Phone{
    private String version;
    private int price;
    private int volume;

    public Lenovo(String name, String version, int price, int volume) {
        super(name);
        this.version = version;
        this.price = price;
        this.volume = volume;
    }

    public Lenovo(String name, int i, int i1) {
        super(name);

    }
    @Override
    public void print() {
        System.out.println("Version:"+ version
                +"\nPrice:"+ price
                +"\nVolume" + volume);
    }
}
