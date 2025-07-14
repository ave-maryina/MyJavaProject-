package lesson11;

import java.util.Random;

public class MyArrayRunner {
    public static void main(String[] args) {
        String[][] array = new String[4][4];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = String.valueOf(new Random().nextInt(3) + 0);
            }
        }

        array[2][1] = "k";

        try {
            MyArrayReceiver.arrayReceiver(array);
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Sum of array elements: " + MyArrayCalculator.sumArray(array) + ".");
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }
}
