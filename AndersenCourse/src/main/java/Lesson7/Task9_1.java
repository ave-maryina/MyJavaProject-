package Lesson7;

public class Task9_1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        int n = -2;

        for (int i = 0; i < shiftArray(array, n).length; i++) {
            System.out.print(shiftArray(array, n)[i] + " ");
        }
    }

    public static int[] shiftArray(int array[], int n) {
        int[] array2 = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            if (n < 0) {
                if (i > Math.abs(n) - 1) {
                    array2[i] = array[i - Math.abs(n)];
                } else {
                    array2[i] = array[i + Math.abs(n)];
                }
            } else if (n > 0) {
                if (i < Math.abs(n)) {
                    array2[i] = array[array.length - n + i];
                } else {
                    array2[i] = array[i - n];
                }
            }
        }
        return array2;
    }
}
