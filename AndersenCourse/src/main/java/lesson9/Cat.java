package lesson9;

public class Cat extends Animal {
    private boolean fullness;

    public Cat(String name) {
        super(name);
        this.fullness = false;
        AnimalCount.addCat();
    }

    public boolean isFullness() {
        return fullness;
    }

    @Override
    public void run(int lengthObst) {
        if (lengthObst <= 200) {
            System.out.println(this.getName() + " run " + lengthObst + " meters.");
        } else {
            System.out.println(this.getName() + " cannot run more than 200 meters.");
        }
    }

    @Override
    public void swim(int lengthObst) {
        System.out.println(this.getName() + " cannot swim.");
    }

    @Override
    public void eat(int foodAmount, FoodBowl bowl) {
        if (bowl.getFoodAmount() >= foodAmount) {
            bowl.setFoodAmount(bowl.getFoodAmount() - foodAmount);
            this.fullness = true;
        } else {
            System.out.println("Not enough food in the bowl.");
        }
    }
}
