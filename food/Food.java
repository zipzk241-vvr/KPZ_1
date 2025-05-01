package food;

public abstract class Food {
    protected String type;

    public Food(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
