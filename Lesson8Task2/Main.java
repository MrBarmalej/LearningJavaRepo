package Lesson8Task2;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Triangle(3,4,5),
                new Rectangle(4,6),
                new Circle(5),
                new Rectangle(5,9),
                new Circle(4)
        };
        System.out.println(Arrays.toString(shapes));
        System.out.println(IntStream.of(0, 1, 2, 3, 4).mapToDouble(i -> shapes[i].perimeter()).sum());


    }


}

