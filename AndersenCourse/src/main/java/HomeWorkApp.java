import java.util.Random;

public class HomeWorkApp {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    public static void checkSumSign() {
        int a = - 5;
        int b =  new Random().nextInt(6) + 1;

        if  (a +  b >= 0) {
            System.out.println("The sum is positive");
        }
        else {
            System.out.println("The sum is negative");
        }
    }

    public static void printColor() {

        int value = new java.util.Random().nextInt(301) - 100;

        if (value <= 0) {

            System.out.println("Red");
        }
        else if ( value > 0 && value <= 100 ) {

            System.out.println("Yellow");
        }
        else if (value > 100) {

            System.out.println("Green");
        }

    }

    public static void compareNumbers() {
        int a = new Random().nextInt(6) + 1;
        int b = new Random().nextInt(6) + 1;

        System.out.println(a);
        System.out.println(b);

        if (a >= b ) {
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }
    }
}
