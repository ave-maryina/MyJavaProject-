package Lesson7;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(isNegative(-5));
    }

    public static boolean isNegative(int a) {
        boolean isNeg = true;

        if (a >= 0) {
            return !isNeg;
        }
        return isNeg;
    }
}
