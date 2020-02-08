public class Task2 {
    protected String description;

    public Task2(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
    // @Override
    public String toString() {
        return "description: " + description;
    }
}
