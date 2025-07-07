package lesson9;

public abstract class Animal {
    private String name;

    public abstract void run(int lengthObst);

    public abstract void swim(int lengthObst);

    public abstract void eat(int foodAmount, FoodBowl bowl);

    public Animal(String name) {
        this.name = name;
        AnimalCount.addAnAnimal();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
