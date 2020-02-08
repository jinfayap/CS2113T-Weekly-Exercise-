package ex7;

// [Key Exercise] printPrice
public class Main {
    public static void printPrice(String item) {
        // TODO: add your code here
        int dividerPosition = item.indexOf("--");
        String itemName = item.substring(0, dividerPosition);
        String itemPrice = item.substring(dividerPosition + 3);
        itemPrice = itemPrice.replace("/", ".");
        System.out.println(itemName.toUpperCase().trim() + ": " + itemPrice);
    }

    public static void main(String[] args) {
        printPrice("sandwich  --$4/50");
        printPrice("  soda --$10/00");
        printPrice("  fries --$0/50");
    }
}
