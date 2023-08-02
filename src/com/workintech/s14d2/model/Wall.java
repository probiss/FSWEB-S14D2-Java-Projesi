package com.workintech.s14d2.model;

import com.workintech.s14d2.enums.Direction;

public class Wall {
    private Direction direction;

    public Wall(Direction direction) {
        this.direction = direction;
    }

    public Direction getDirection() {
        return direction;
    }

    public void create() {
        System.out.println(getDirection());
    }
}
