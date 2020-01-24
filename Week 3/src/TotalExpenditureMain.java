import java.util.Scanner;
import java.util.Arrays;

public class TotalExpenditureMain {
    // You can add more methods here
    public static String[] spiltSentenceToWords(String sentence) {
        String[] words = sentence.split(" ");
        return words;
    }

    public static double localExpensesConversion(String[] expenses) {
        double sum = 0.00;
        String[] overseaExpenses = new String[expenses.length];
        for (int i = 0; i < expenses.length; i++) {
            overseaExpenses[i] = expenses[i].substring(1);
        }
        for (String money : overseaExpenses) {
            sum += 1.7 * Double.parseDouble(money);
        }
        return sum;
    }

    public static String[] extractExpenses(String[] words) {
        String[] expenses = new String[words.length];
        int moneyCount = 0;
        for (String money : words) {
            if (money.contains("$")) {
                expenses[moneyCount++] = money;
            }
        }
        return Arrays.copyOf(expenses, moneyCount);
    }

    public static void main(String[] args) {
        String line;
        Scanner in = new Scanner(System.in);

        System.out.print("Your expenses while overseas?");
        // TODO: add your code here
        String sentence = in.nextLine();
        String[] words = spiltSentenceToWords(sentence);
        String[] overseaExpenses = extractExpenses(words);
        double localExpenses = localExpensesConversion(overseaExpenses);
        System.out.println("Expenses in overseas currency: " + Arrays.toString(overseaExpenses));
        System.out.format("Total in local currency: $%.2f \n", localExpenses);
    }
}
