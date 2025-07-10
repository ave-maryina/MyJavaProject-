package fruitBox;

public class Runner {
    public static void main(String[] args) {
        Box<Orange> orangeBox1 = new Box<>();
        Box<Apple> appleBox = new Box<>();
        Box<Apple> appleBox1 = new Box<>();
        Box<Orange> orangeBox = new Box<>();

        Apple apple = new Apple();
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Apple apple4 = new Apple();
        Apple apple5 = new Apple();
        Apple apple6 = new Apple();
        Apple apple7 = new Apple();
        Orange orange =  new Orange();
        orangeBox1.addFruit(orange);

        appleBox.addFruit(apple1);
        appleBox.addFruit(apple2);
        appleBox.addFruit(apple3);
        appleBox.addFruit(apple4);

        System.out.println(appleBox.getWeight());
        System.out.println(orangeBox.getWeight());
        System.out.println(appleBox.compare(orangeBox));
        System.out.println(appleBox.compare(appleBox1));

        for (Fruit fruit : appleBox1.getFruits()) {
            System.out.println(fruit);
        }
        appleBox.transferFruitsTo(appleBox1);

        for (Fruit fruit : appleBox1.getFruits()) {
            System.out.println(fruit);
        }
    }
}
