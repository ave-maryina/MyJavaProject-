package lesson9;

public class AnimalRunner {
    public static void main(String[] args) {
        Animal catMursik = new Cat("Mursik");
        Animal dogBobik = new Dog("Bobik");
        catMursik.run(80);
        catMursik.swim(50);
        dogBobik.run(150);
        dogBobik.swim(10);
        AnimalCount.printAnimalCount();
        FoodBowl bowl = new FoodBowl();
        bowl.printFoodAmount();
        bowl.fillBowl(40);
        bowl.printFoodAmount();
        catMursik.eat(11, bowl);
        bowl.printFoodAmount();

        Cat[] cats = {new Cat("Siri"), new Cat("Hurrem"), new Cat("Kotichka"), new Cat("Vasiliy")};

        for (Cat cat : cats) {
            cat.eat(10, bowl);
        }

        for (Cat cat : cats) {
            System.out.println(cat.getName() + " fullness: " + cat.isFullness());
        }
    }
}
