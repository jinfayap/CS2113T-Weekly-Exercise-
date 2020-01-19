public class TimeMain {
    public static void main (String[] args){
        Time t = new Time(1,1,30);
        t.getTime();

        Time h = new Time(2,2,40);
        h.getTime();
        t.getTime();

        System.out.println(h.getHour());
        h.setHour(10);
        System.out.println(h.getHour());

    }
}
