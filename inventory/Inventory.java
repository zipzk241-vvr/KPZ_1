package inventory;

import animal.Animal;
import enclosure.Enclosure;
import staff.Staff;
import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Animal> animals = new ArrayList<>();
    private List<Staff> staffMembers = new ArrayList<>();
    private List<Enclosure> enclosures = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void addStaff(Staff staff) {
        staffMembers.add(staff);
    }

    public void addEnclosure(Enclosure enclosure) {
        enclosures.add(enclosure);
    }

    public void printInventory() {
        System.out.println("--- Інвентаризація Зоопарку ---");
        System.out.println("Тварини:");
        for (Animal a : animals) {
            System.out.println(" - " + a.getInfo());
        }
        System.out.println("Працівники:");
        for (Staff s : staffMembers) {
            System.out.println(" - " + s.getInfo());
        }
        System.out.println("Вольєри:");
        for (Enclosure e : enclosures) {
            System.out.println(" - " + e.getInfo());
        }
    }
}
