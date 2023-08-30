package Lesson8Task2;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr;
        arr = new String[5];

        System.out.println("What is the first figure?");
        String fig1 = scanner.next();
        int fig1Perimeter;
        switch (fig1) {
            case "Triangle":
                Triangle triangle = new Triangle();
                System.out.println("Enter the 1st side length");
                int tri1side1_1 = scanner.nextInt();
                triangle.side1 = tri1side1_1;
                System.out.println("Enter the 2nd side length");
                int tri1side2_1 = scanner.nextInt();
                triangle.side2 = tri1side2_1;
                System.out.println("Enter the 3d side length");
                int tri1side3_1 = scanner.nextInt();
                triangle.side3 = tri1side3_1;
                fig1Perimeter = triangle.triPerimeter();
                arr[0] = "Triangle. Perimeter is " + fig1Perimeter;
                break;
            case "Rectangle":
                Rectangle rectangle = new Rectangle();
                System.out.println("Enter the length");
                int rec1side1_1 = scanner.nextInt();
                rectangle.recHeight = rec1side1_1;
                System.out.println("Enter the width");
                int rec1side2_1 = scanner.nextInt();
                rectangle.recWidth = rec1side2_1;
                fig1Perimeter = rectangle.recPerimeter();
                arr[0] = "Rectangle. Perimeter is " + fig1Perimeter;
                break;
            case "Circle":
                Circle circle = new Circle();
                System.out.println("Enger the radius");
                int circle1rad_1 = scanner.nextInt();
                circle.circleRadius = circle1rad_1;
                fig1Perimeter = (int) circle.circlePerimeter();
                arr[0] = "Circle. Perimeter is " + fig1Perimeter;
                break;
        }
        System.out.println(Arrays.toString(arr));
        int fig2Perimeter;
        System.out.println("What is the second figure?");
        String fig2 = scanner.next();
        switch (fig2) {
            case "Triangle":
                Triangle triangle = new Triangle();
                System.out.println("Enter the 1st side length");
                int tri1side1_2 = scanner.nextInt();
                triangle.side1 = tri1side1_2;
                System.out.println("Enter the 2nd side length");
                int tri1side2_2 = scanner.nextInt();
                triangle.side2 = tri1side2_2;
                System.out.println("Enter the 3d side length");
                int tri1side3_2 = scanner.nextInt();
                triangle.side3 = tri1side3_2;
                fig2Perimeter = triangle.triPerimeter();
                arr[1] = "Triangle. Perimeter is " + fig2Perimeter;
                break;
            case "Rectangle":
                Rectangle rectangle = new Rectangle();
                System.out.println("Enter the height");
                int rec1side1_2 = scanner.nextInt();
                rectangle.recHeight = rec1side1_2;
                System.out.println("Enter the width");
                int rec1side2_2 = scanner.nextInt();
                rectangle.recWidth = rec1side2_2;
                rectangle.recPerimeter();
                fig2Perimeter = rectangle.recPerimeter();
                arr[1] = "Rectangle. Perimeter is " + fig2Perimeter;
                break;
            case "Circle":
                Circle circle = new Circle();
                System.out.println("Enger the radius");
                int circle1rad_2 = scanner.nextInt();
                circle.circleRadius = circle1rad_2;
                fig2Perimeter = (int) circle.circlePerimeter();
                arr[1] = "Circle. Perimeter is " + fig2Perimeter;
                break;
            }
        System.out.println(Arrays.toString(arr));
        int fig3Perimeter;
        System.out.println("What is the third figure?");
        String fig3 = scanner.next();
        switch (fig3) {
            case "Triangle":
                Triangle triangle = new Triangle();
                System.out.println("Enter the 1st side length");
                int tri1side1_3 = scanner.nextInt();
                triangle.side1 = tri1side1_3;
                System.out.println("Enter the 2nd side length");
                int tri1side2_3 = scanner.nextInt();
                triangle.side2 = tri1side2_3;
                System.out.println("Enter the 3d side length");
                int tri1side3_3 = scanner.nextInt();
                triangle.side3 = tri1side3_3;
                fig3Perimeter = triangle.triPerimeter();
                arr[3] = "Triangle. Perimeter is " + fig3Perimeter;
                break;
            case "Rectangle":
                Rectangle rectangle = new Rectangle();
                System.out.println("Enter the height");
                int rec1side1_3 = scanner.nextInt();
                rectangle.recHeight = rec1side1_3;
                System.out.println("Enter the width");
                int rec1side2_3 = scanner.nextInt();
                rectangle.recWidth = rec1side2_3;
                rectangle.recPerimeter();
                fig3Perimeter = rectangle.recPerimeter();
                arr[3] = "Rectangle. Perimeter is " + fig3Perimeter;
                break;
            case "Circle":
                Circle circle = new Circle();
                System.out.println("Enger the radius");
                int circle1rad_2 = scanner.nextInt();
                circle.circleRadius = circle1rad_2;
                fig3Perimeter = (int) circle.circlePerimeter();
                arr[3] = "Circle. Perimeter is " + fig3Perimeter;
                break;
        }
    int fig4Perimeter;
        System.out.println("What is the fourth figure?");
        String fig4 = scanner.next();
        switch (fig4) {
            case "Triangle":
                Triangle triangle = new Triangle();
                System.out.println("Enter the 1st side length");
                int tri1side1_4 = scanner.nextInt();
                triangle.side1 = tri1side1_4;
                System.out.println("Enter the 2nd side length");
                int tri1side2_4 = scanner.nextInt();
                triangle.side2 = tri1side2_4;
                System.out.println("Enter the 3d side length");
                int tri1side3_4 = scanner.nextInt();
                triangle.side3 = tri1side3_4;
                fig4Perimeter = triangle.triPerimeter();
                arr[3] = "Triangle. Perimeter is " + fig4Perimeter;
                break;
            case "Rectangle":
                Rectangle rectangle = new Rectangle();
                System.out.println("Enter the height");
                int rec1side1_4 = scanner.nextInt();
                rectangle.recHeight = rec1side1_4;
                System.out.println("Enter the width");
                int rec1side2_4 = scanner.nextInt();
                rectangle.recWidth = rec1side2_4;
                rectangle.recPerimeter();
                fig4Perimeter = rectangle.recPerimeter();
                arr[3] = "Rectangle. Perimeter is " + fig4Perimeter;
                break;
            case "Circle":
                Circle circle = new Circle();
                System.out.println("Enger the radius");
                int circle1rad_4 = scanner.nextInt();
                circle.circleRadius = circle1rad_4;
                fig4Perimeter = (int) circle.circlePerimeter();
                arr[3] = "Circle. Perimeter is " + fig4Perimeter;
                break;
        }
        System.out.println(Arrays.toString(arr));
        int fig5Perimeter;
        System.out.println("What is the fifth figure?");
        String fig5 = scanner.next();
        switch (fig5) {
            case "Triangle":
                Triangle triangle = new Triangle();
                System.out.println("Enter the 1st side length");
                int tri1side1_5 = scanner.nextInt();
                triangle.side1 = tri1side1_5;
                System.out.println("Enter the 2nd side length");
                int tri1side2_5 = scanner.nextInt();
                triangle.side2 = tri1side2_5;
                System.out.println("Enter the 3d side length");
                int tri1side3_5 = scanner.nextInt();
                triangle.side3 = tri1side3_5;
                fig5Perimeter = triangle.triPerimeter();
                arr[4] = "Triangle. Perimeter is " + fig5Perimeter;
                break;
            case "Rectangle":
                Rectangle rectangle = new Rectangle();
                System.out.println("Enter the height");
                int rec1side1_5 = scanner.nextInt();
                rectangle.recHeight = rec1side1_5;
                System.out.println("Enter the width");
                int rec1side2_5 = scanner.nextInt();
                rectangle.recWidth = rec1side2_5;
                rectangle.recPerimeter();
                fig5Perimeter = rectangle.recPerimeter();
                arr[4] = "Rectangle. Perimeter is " + fig5Perimeter;
                break;
            case "Circle":
                Circle circle = new Circle();
                System.out.println("Enger the radius");
                int circle1rad_5 = scanner.nextInt();
                circle.circleRadius = circle1rad_5;
                fig5Perimeter = (int) circle.circlePerimeter();
                arr[4] = "Circle. Perimeter is " + fig5Perimeter;
                break;
        }
        System.out.println(Arrays.toString(arr));
    }
}
