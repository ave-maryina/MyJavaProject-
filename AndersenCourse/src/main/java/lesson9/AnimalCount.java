package lesson9;

public final class AnimalCount {
    private static int animalCount = 0;
    private static int catCount = 0;
    private static int dogCount = 0;

    public static void addAnAnimal() {
        animalCount++;
    }

    public static void addCat() {
        catCount++;
    }

    public static void addDog() {
        dogCount++;
    }

    public static void printAnimalCount() {
        System.out.println("Total number of animals: " + animalCount + ".\nNumber of cats: " + catCount + ".\nNumber of dogs: " + dogCount + ".");
    }
}
