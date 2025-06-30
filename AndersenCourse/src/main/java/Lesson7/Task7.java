package Lesson7;

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(createArray()));
    }

    public static int[] createArray() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
        return array;
    }
}
