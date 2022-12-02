package com.edstem.session2;

public class MyData {
    private final int number;

    public MyData(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "" + number;
    }
}
