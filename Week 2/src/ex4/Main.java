package ex4;

public class Main {
    public static void main(String[] args) {
        String[] grades = new String[] {"A+", "A", "A-"};
        double[] caps = getMultipleGradeCaps(grades);
        for (int i = 0; i < grades.length; i++) {
            System.out.println(grades[i] + ":" + caps[i]);
        }
    }

    public static double[] getMultipleGradeCaps(String[] grades) {
        double[] gradeCaps = new double[grades.length];
        for (int i = 0; i < grades.length; i++) {
            gradeCaps[i] = getGradeCap(grades[i]);
        }
        return gradeCaps;
    }

    public static double getGradeCap(String grade) {
        double cap = 0.0;
        switch (grade) {
            case "A+":
            case "A":
                cap = 5.0;
                break;
            case "A-":
                cap = 4.5;
                break;
            case "B+":
                cap = 4.0;
                break;
            case "B":
                cap = 3.5;
                break;
            case "B-":
                cap = 3.0;
                break;
            case "C":
                cap = 2.5;
                break;
            default:
                cap = 0.0;
                break;
        }
        return cap;
    }
}
