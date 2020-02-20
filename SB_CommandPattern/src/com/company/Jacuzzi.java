package com.company;

public class Jacuzzi implements ElectronicDevice{

    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;

    private int speed = 0;

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // code to set fan speed High
    public void high() { speed = HIGH;
        System.out.println("Jacuzzi is on high");
    }

    // code to set fan speed Medium
    public void medium() { speed = MEDIUM;
        System.out.println("Jacuzzi is on Medium");
    }

    // code to set fan speed LOw
    public void low() { speed = LOW;
        System.out.println("Jacuzzi is on Medium");
    }


    @Override
    public void on() {
        System.out.println("Jacuzzi is on");
        speed = HIGH;
    }

    @Override
    public void off() {
        System.out.println("Jacuzzi is off");
        speed = OFF;
    }

    @Override
    public void volumeUp() {
        // pass
    }

    @Override
    public void volumeDown() {
        // pass
    }
}
