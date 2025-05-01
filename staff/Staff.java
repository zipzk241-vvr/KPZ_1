package staff;

public class Staff {
    protected String name;
    protected String role;

    public Staff(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public String getInfo() {
        return "Працівник: " + name + ", посада: " + role;
    }
}
