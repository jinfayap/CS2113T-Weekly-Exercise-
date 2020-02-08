package ex4;

public enum Priority {
    HIGH,
    MEDIUM,
    LOW;

    public String toString() {
        return name().toLowerCase();
    }
}
