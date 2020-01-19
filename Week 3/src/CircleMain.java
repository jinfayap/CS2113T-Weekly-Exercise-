public class CircleMain {
    public static void main (String[] args){
        // [Key Exercise] Define a circle class
        Circle c1 = new Circle();

        System.out.println(c1.getArea());
        c1 = new Circle(1,2,5);
        System.out.println(c1.getArea());

        // [Key Exercise] add getters/setters to the Circle Class
        Circle c2 = new Circle(1,2, 5);

        c2.setX(4);
        c2.setY(5);
        c2.setRadius(6);
        System.out.println("x      : " + c2.getX());
        System.out.println("y      : " + c2.getY());
        System.out.println("radius : " + c2.getRadius());
        System.out.println("area   : " + c2.getArea());

        c2.setRadius(-5);
        System.out.println("radius : " + c2.getRadius());
        c2 = new Circle(1, 1, -4);
        System.out.println("radius : " + c2.getRadius());

        //[Key Exercise] add getMaxRadius to the Circle class
        Circle c3 = new Circle();
        System.out.println("max radius used so far : " + Circle.getMaxRadius());
        c3 = new Circle(0, 0, 10);
        System.out.println("max radius used so far : " + Circle.getMaxRadius());
        c3 = new Circle(0, 0, -15);
        System.out.println("max radius used so far : " + Circle.getMaxRadius());
        c3.setRadius(12);
        System.out.println("max radius used so far : " + Circle.getMaxRadius());
    }

}
