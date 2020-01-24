public class TaskMain2 {
    public static void main(String[] args) {
        // create a todo task and print it
        Todo2 t = new Todo2("Read a good book");
        System.out.println(t);

        // change todo fields and print again
        t.setDone(true);
        System.out.println(t);

        // create a deadline task and print it
        Deadline2 d = new Deadline2("Read textbook", "Nov 16");
        System.out.println(d);

        // change deadline details and print again
        d.setDone(true);
        d.setBy("Postponed to Nov 18th");
        System.out.println(d);
    }
}
