## 🐾 Zoo Inventory System

Project is a simple zoo inventory system written in Java. It demonstrates object-oriented principles and follows clean code practices.

### ✅ Principles Demonstrated

---

### 1. **DRY (Don't Repeat Yourself)**
We avoid duplicating logic — all animals extend a single `Animal` class, which holds common fields and methods.

🔗 [Animal.java](./animal/Animal.java#L6-L19)

---

### 2. **KISS (Keep It Simple, Stupid)**
The classes are small, concise, and do one thing only (Single Responsibility). `Inventory` class is only responsible for managing lists and printing the inventory.

🔗 [Inventory.java](./inventory/Inventory.java#L9-L40)

---

### 3. **Single Responsibility Principle (S in SOLID)**
Each class has exactly one reason to change:
- `Lion.java` handles lion-specific behavior.
- `Zookeeper.java` represents one staff role.
- `Inventory.java` manages zoo items.

🔗 [Lion.java](./animal/Lion.java)  
🔗 [Inventory.java](./inventory/Inventory.java)

---

### 4. **Open/Closed Principle (O in SOLID)**
We can add new animal types or enclosures without changing existing code — just extend base classes.

🔗 [Lion.java](./animal/Lion.java) extends [Animal.java](./animal/Animal.java)  
🔗 [SmallEnclosure.java](./enclosure/SmallEnclosure.java) extends [Enclosure.java](./enclosure/Enclosure.java)

---

### 5. **Liskov Substitution Principle (L in SOLID)**
Every subclass can be used in place of its parent class.  `Lion` can be used wherever `Animal` is expected.

🔗 [Main.java](./Main.java#L8) — `addAnimal(new Lion(...))`

---

### 6. **Interface Segregation Principle (I in SOLID)**
While not many interfaces are used here, we demonstrate that not all responsibilities are forced onto one class — e.g., feeding is not pushed into `Animal`.

---

### 7. **Dependency Inversion Principle (D in SOLID)**
Currently not shown via interfaces explicitly, but the design is prepared to accept abstraction — for instance, we could use an `IAnimal` interface and inject implementations.

---

### 8. **YAGNI (You Aren’t Gonna Need It)**
We avoid over-engineering. Only features that are currently needed are implemented (e.g., no GUI, no DB).

---

### 9. **Composition Over Inheritance**
Though inheritance is used for basic behavior reuse, you can easily imagine composition (e.g., `Enclosure` having a `List<Animal>` instead of being extended for each size).

---

### 10. **Program to Interfaces, not Implementations**
The method `addAnimal(Animal animal)` and `addStaff(Staff staff)` in `Inventory.java` work with abstract types, not specific classes.

🔗 [Inventory.java](./inventory/Inventory.java#L12-L28)

---

### 11. **Fail Fast (not fully applicable)**
Keep constructors and logic simple, but in a bigger system, early input validation would be placed in constructors or setters.

---

## 🥪 How to Test

Simply run `Main.java`, and you will see output proving class interaction works:

```bash
--- Інвентаризація Зоопарку ---
Тварини:
 - Лев: Сімба, 5 років
Працівники:
 - Працівник: Ігор, посада: Годувальник
Вольєри:
 - Вольєр: Вольєр для левів
```

---

## 📁 Project Structure

```
ZooInventorySystem/
├── Main.java
├── animal/
├── enclosure/
├── food/
├── staff/
├── inventory/
└── README.md
```