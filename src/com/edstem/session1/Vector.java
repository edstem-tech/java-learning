package com.edstem.session1;

public class Vector {
    private int direction;
    private int magnitude;

    public Vector() {
    }

    public Vector(int direction, int magnitude) {
        this.direction = direction;
        this.magnitude = magnitude;
    }

    public Vector add(Vector vector) {
        this.direction += vector.direction;
        this.magnitude += vector.magnitude;

        return this;
    }
}
