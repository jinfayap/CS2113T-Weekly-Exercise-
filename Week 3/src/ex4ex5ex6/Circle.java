package ex4ex5ex6;

public class Circle {
    // [Key Exercise] Define a circle class
    private int x;
    private int y;
    private double radius;
    private static double maxRadius = 0;

    public Circle() {
        this.x = 0;
        this.y = 0;
        this.radius = 0;
    }

    public Circle(int x, int y, double radius) {
        this.x = x;
        setY(y);
        setRadius(radius);
        setMaxRadius(radius);
    }

    public int getArea() {
        double area;
        area = Math.PI * (int) this.radius * (int) this.radius;
        return (int) area;
    }
    // [Key Exercise] add getters/setters to the Circle Class
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(double radius) {
        if (radius <= 0.0) {
            this.radius = 0;
        } else {
            this.radius = radius;
        }
        setMaxRadius(this.radius);
    }
    // [Key Exercise] add getMaxRadius to the Circle class
    public static double getMaxRadius() {
        return maxRadius;
    }

    public void setMaxRadius(double radius) {
        if (radius > this.maxRadius) {
            this.maxRadius = radius;
        }
    }
}
