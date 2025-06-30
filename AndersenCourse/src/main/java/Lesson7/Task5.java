package Lesson7;
import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        createArray();
    }

    public static void createArray() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the array size: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Enter array elements 0 and 1 in any order using the \"Enter\" button: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < size; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else if (array[i] == 1) {
                array[i] = 0;
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
