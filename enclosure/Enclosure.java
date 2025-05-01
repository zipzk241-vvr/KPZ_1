package enclosure;

public abstract class Enclosure {
    protected String name;

    public Enclosure(String name) {
        this.name = name;
    }

    public String getInfo() {
        return "Вольєр: " + name;
    }
}
