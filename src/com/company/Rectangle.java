package com.company;

public class Rectangle {
    int lenght, width;

    public Rectangle(int length, int width) {
        this.lenght = length;
        this.width = width;
    }

    public void meth() {
        if (lenght == width)
            System.out.println("It's a square(" + lenght + ", " + width + ") area --> " + lenght * width);
        else System.out.println("It's a rectangle(" + lenght + ", " + width + ") perimeter --> " + 2*(lenght + width));
    }
}
