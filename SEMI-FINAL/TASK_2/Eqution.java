package com.catalin.org;
/*
Author: Kirill Zakrewski
Date: 21.10.2021
*/

public class Eqution {
    double a = 0;
    double b = 10;
    double infelicity = 1e-3;

    Eqution() {}

    public Eqution(double a, double b, double infelicity) {
        this.a = a;
        this.b = b;
        this.infelicity = infelicity;
    }

    public double getX() {
        double c = (a + b) / 2;

        if(getY(a) * getY(c) < 0) {
            b = c;
        } else {
            a = c;
        }

        if(Math.abs(a - b) < infelicity) {
            return c;
        }

        return getX();
    }

    private double getY(double c) {
        return Math.cos(Math.pow(c, 5)) + Math.pow(c, 4) - 345.3 * c - 23;
    }

}
