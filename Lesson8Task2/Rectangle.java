package Lesson8Task2;

import java.util.Scanner;

class Rectangle implements Shape{
    private int height;
    private int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double perimeter() {
        return 2 * (height + width);
    }

    @Override
    public double square() {
        return height * width;
    }
}
