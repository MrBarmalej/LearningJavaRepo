package Lesson8Task2; 

public class Circle implements Shape {
    private int circleRadius;

    public Circle(int circleRadius) {
        this.circleRadius = circleRadius;
    }

    public int getCircleRadius() {
        return circleRadius;
    }

    public void setCircleRadius(int circleRadius) {
        this.circleRadius = circleRadius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * circleRadius;
    }

    @Override
    public double square() {
        return (int) (Math.PI * (circleRadius ^ 2));
    }
}
