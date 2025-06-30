package Lesson7;

public class Task2 {
    public static void main(String[] args) {

        isPositive(0);
    }

    public static void isPositive(int a) {
        if (a >= 0) {
            System.out.println(a + " is positive number");
        } else {
            System.out.println(a + " is negative number");
        }
    }
}
