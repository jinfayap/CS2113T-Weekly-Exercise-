public class Todo extends Task {
    protected boolean toDoDone;

    public Todo(String description) {
        super(description);
        this.toDoDone = false;
    }

    public boolean isDone() {
        return toDoDone;
    }

    public void setDone(boolean toDoDone) {
        this.toDoDone = true;
    }
}
