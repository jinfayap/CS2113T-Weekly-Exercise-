package ex4;

public class Main {

    public static void describe(String color, Priority level) {

        System.out.println(color + " indicates " + level + " priority");
    }

    public static void main(String[] args) {
        describe("Red", Priority.HIGH);
        describe("Orange", Priority.MEDIUM);
        describe("Blue", Priority.MEDIUM);
        describe("Green", Priority.LOW);
    }
}
