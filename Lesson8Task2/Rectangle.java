package Lesson8Task2;

import java.util.Scanner;

class Rectangle extends Shape{
    int recHeight;
    int recWidth;


    int recSqare(){
        int recSquare = recHeight * recWidth;
        System.out.println("The rectangle square is " + recSquare);
        return recSquare;
    }
    int recPerimeter(){
        int recPerimeter = 2 * (recHeight + recWidth);
        System.out.println("The rectangle perimeter is " + recPerimeter);
        return recPerimeter;
    }
}
