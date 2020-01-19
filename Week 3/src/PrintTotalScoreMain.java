public class PrintTotalScoreMain {
    public static void printTotalScore(String[] values){
        // TODO: add your code here
        int sum = 0;
        for (String value : values){
            sum += Integer.parseInt(value);
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        printTotalScore(new String[]{});
        printTotalScore(new String[]{"0", "124", "-15"});
    }
}
