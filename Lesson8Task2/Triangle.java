package Lesson8Task2;

public class Triangle extends Shape{
    int side1;
    int side2;
    int side3;

    double triSquare(){
        double polu = (double) (side1 + side2 + side3) /2;
        double polu1 = polu - side1;
        double polu2 = polu - side2;
        double polu3 = polu - side3;
        double p2 = (polu * polu1 * polu2 * polu3);
        double triSquare = Math.sqrt(p2);
        System.out.println("The triangle square is " + triSquare);
        return triSquare;
    }
    int triPerimeter(){
        int triPerimeter = side1 + side2 + side3;
        System.out.println("The triangle perimeter is " + triPerimeter);
        return triPerimeter;
    }

}

