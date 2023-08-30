package Lesson8Task2;

public class Circle extends Shape{
    int circleRadius;
    double circleSquare(){
        double circleSquare = Math.PI * (circleRadius^2);
        System.out.println("The circle square is " + circleSquare);
        return circleSquare;
    }
    double circlePerimeter(){
        double circlePerimeter = 2 * Math.PI * circleRadius;
        System.out.println("The circle perimeter is " + circlePerimeter);
        return circlePerimeter;
    }
}
