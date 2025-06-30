package Lesson7;

public class Task4_1 {
    public static void main(String[] args) {
        System.out.println(ifLeapYear(2028));
    }

    public static boolean ifLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0) {
            return true;
        } else if (year % 400 == 0) {
            return true;
        }
        return false;
    }
}
