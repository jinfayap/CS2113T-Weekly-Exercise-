import java.awt.Rectangle;

public class RectangleMain {
    public static void main(String[] args){

        Rectangle r;
        r = new Rectangle(0, 0, 4,6);
        System.out.println(r);

        int area;
        area = r.height * r.width;
        System.out.println("Area: " + area);

        r.setSize(8,10);
        System.out.println(r);
    }
}
