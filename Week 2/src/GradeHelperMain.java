import java.util.Scanner;
public class GradeHelperMain {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Please Enter a Grade [A+, A, A-, B+, B, B-, C] to know the CAP: ");
        String gradeInput = in.nextLine();
        System.out.println("CAP for grade " + gradeInput.toUpperCase() + " is " + GradeHelper(gradeInput.toUpperCase()));
    }
    public static double GradeHelper(String grade){
        double cap = 0.0;
        switch (grade){
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
