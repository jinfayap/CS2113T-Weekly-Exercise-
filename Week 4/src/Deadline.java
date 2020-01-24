public class Deadline extends Todo {
    private String by;

    public Deadline(String description, String by) {
        super(description);
        this.by = by;
        this.toDoDone = false;
    }

    public String getBy() {
        return by;
    }

    public void setBy(String by) {
        this.by = by;
    }
}
