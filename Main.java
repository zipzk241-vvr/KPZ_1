import animal.*;
import enclosure.*;
import food.*;
import staff.*;
import inventory.*;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        // Додаємо тварин
        inventory.addAnimal(new Lion("Сімба", 5));

        // Додаємо працівника
        inventory.addStaff(new Zookeeper("Ігор", "Годувальник"));

        // Додаємо вольєр
        inventory.addEnclosure(new SmallEnclosure("Вольєр для левів"));
        // Виводимо інвентаризацію
        inventory.printInventory();
    }
}
