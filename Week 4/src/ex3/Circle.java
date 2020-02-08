package ex3;

public class Circle extends Shape{

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int area() {
        return (int)(Math.PI * radius * radius);
    }
}