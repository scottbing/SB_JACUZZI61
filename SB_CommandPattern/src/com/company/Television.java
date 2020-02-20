package com.company;

public class Television implements ElectronicDevice{

    private int volume = 0;

    @Override
    public void on() {
        System.out.println("TV is on");
    }

    @Override
    public void off() {
        System.out.println("TV is off");
    }

    @Override
    public void volumeUp() {
        System.out.println("TV Volume is " + volume);
    }

    @Override
    public void volumeDown() {
        System.out.println("TV Volume is " + volume);
    }

    public void high() {
        // ignore
    }

    public void medium() {
        // ignore
    }
}
