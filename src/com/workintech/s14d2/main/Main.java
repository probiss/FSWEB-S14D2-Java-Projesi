package com.workintech.s14d2.main;

import com.workintech.s14d2.enums.Direction;
import com.workintech.s14d2.enums.LampType;
import com.workintech.s14d2.enums.PaintColor;
import com.workintech.s14d2.model.*;

public class Main {
    public static void main(String[] args) {
        Bedroom bedroom = new Bedroom(
                new Bed("Single", 1, 2, 1, 1),
                new Wardrobe(1, 2, 45.5),
                new Carpet(2, 2, PaintColor.RED),
                "Cihat",
                new Wall(Direction.NORTH),
                new Wall(Direction.EAST),
                new Wall(Direction.WEST),
                new Wall(Direction.SOUTH),
                new Ceiling(3, PaintColor.BLUE),
                new Lamp(LampType.LED, true, 5));

        bedroom.getBed().make();
        bedroom.getLamp().turnOn();
        bedroom.getWardrobe().add();
        bedroom.getCarpet().lying();

        System.out.println(bedroom.getBed());
        System.out.println(bedroom.getLamp());
    }
}