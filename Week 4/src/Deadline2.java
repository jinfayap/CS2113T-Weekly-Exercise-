public class Deadline2 extends Todo2 {

    protected String by;

    public Deadline2(String description, String by) {
        super(description);
        this.by = by;
    }

    public void setBy(String by) {
        this.by = by;
    }

    public String getBy() {
        return by;
    }

    @Override
    public String toString() {
        return super.toString() + System.lineSeparator() + "do by: " + by;
    }
}
