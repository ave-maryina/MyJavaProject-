package Lesson7;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(createArray()));
    }

    public static int[] createArray() {
        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        return array;
    }
}
