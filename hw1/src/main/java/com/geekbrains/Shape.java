package com.geekbrains;

abstract class Shape {
    abstract double getSquare();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getSquare() {
        return Math.sqrt(Math.PI * radius) / 2;
    }
}

class Rectangle extends Shape {
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    double getSquare() {
        return sideA * sideB;
    }
}
