<<<<<<< HEAD:Week 5/src/ex1/Main.java
package ex1;
=======
public class PrintShapeAreaMain {
    // TODO add your methods here
    private static Shape[] shapes = new Shape[100];
    public static int shapeCount = 0;
>>>>>>> 4da153bf94b577a5464514792e8dad1f3b433ead:Week 4/src/PrintShapeAreaMain.java

public class Main {
    private static Shape[] shapes = new Shape[100];
    private static int shapeCount = 0;
    
    public static void addShape(Shape s){
        shapes[shapeCount] = s;
        shapeCount++;
    }
    
    public static void printAreas(){
        for (int i = 0; i < shapeCount; i++){
            shapes[i].print();
        }
    }
    
    public static void main(String[] args) {
        addShape(new Circle(5));
        addShape(new Rectangle(3, 4));
        addShape(new Circle(10));
        addShape(new Rectangle(4, 4));
        printAreas();
    }
}
