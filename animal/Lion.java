package animal;

public class Lion extends Animal {
    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public String getType() {
        return "Лев";
    }
}
