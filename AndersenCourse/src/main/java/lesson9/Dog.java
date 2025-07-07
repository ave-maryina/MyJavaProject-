package lesson9;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
        AnimalCount.addDog();
    }

    @Override
    public void run(int lengthObst) {
        if (lengthObst <= 500) {
            System.out.println(this.getName() + " run " + lengthObst + " meters.");
        } else {
            System.out.println(this.getName() + " cannot run more than 500 meters.");
        }
    }

    @Override
    public void swim(int lengthObst) {
        if (lengthObst <= 10) {
            System.out.println(this.getName() + " swim " + lengthObst + " meters.");
        } else {
            System.out.println(this.getName() + " cannot swim more than 10 meters.");
        }
    }

    @Override
    public void eat(int foodAmount, FoodBowl bowl) {

    }
}
