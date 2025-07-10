package fruitBox;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> fruits = new ArrayList<>();

    public List<T> getFruits() {
        return fruits;
    }

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public float getWeight() {
        float boxWeight = 0.0f;
        for (Fruit fruit : fruits) {
            boxWeight += fruit.getWeight();
        }
        return boxWeight;
    }

    public boolean compare(Box box) {
        return Math.abs(this.getWeight() - box.getWeight()) == 0;
    }

    public void transferFruitsTo(Box<T> box) {
        box.fruits.addAll(this.fruits);
        this.fruits.clear();
    }
}

