package Lesson7;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(checkSum(11, 2));
    }

    public static boolean checkSum(int a, int b) {
        boolean c = false;
        if (a + b >= 10 && a + b <= 20) {
            return !c;
        }
        return c;
    }

}
