package com.workintech.s14d2.model;

import com.workintech.s14d2.enums.LampType;

public class Lamp {
    private LampType style;
    private boolean battery;
    private int globRating;

    public Lamp(LampType style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    public void turnOn() {
        System.out.println("LAmp is being turned on.");
    }

    public LampType getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobRating() {
        return globRating;
    }
}
