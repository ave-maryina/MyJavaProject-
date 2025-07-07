package lesson9;

public class FoodBowl {
    private static int foodAmount;

    public void fillBowl(int foodAmount) {
        if (foodAmount > 0) {
            this.foodAmount += foodAmount;
        } else {
            System.out.println("Negative or zero value is not allowed.");
        }
    }

    public int getFoodAmount() {
        return foodAmount;
    }

    public void setFoodAmount(int foodAmount) {
        this.foodAmount = foodAmount;
    }

    public static void printFoodAmount() {
        System.out.println("Amount of food in a bowl: " + foodAmount);
    }
}
