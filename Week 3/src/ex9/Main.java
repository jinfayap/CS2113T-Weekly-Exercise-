package ex9;

import java.util.Arrays;

public class Main {
    public static String[] filterEmails(String[] items) {
        // TODO: add your code here
        String[] filteredEmails = new String[items.length];
        int matchedCount = 0;
        for (String item : items) {
            if (item.contains("@")) {
                filteredEmails[matchedCount] = item;
                matchedCount++;
            }
        }
        return Arrays.copyOf(filteredEmails, matchedCount);
    }

    public static void printItems(String[] items) {
        // TODO: add your code here
        System.out.println(Arrays.toString(items));
    }

    public static void main(String[] args) {
        printItems(filterEmails(new String[] {}));
        printItems(filterEmails(new String[] {"abc"}));
        printItems(
                filterEmails(
                        new String[] {"adam@example.com", "aab", "john@example.com", "some@"}));
        printItems(filterEmails(new String[] {"xyz", "@bee.com", "aab"}));
    }
}
