package lesson11;

public class MyArrayCalculator {
    public static int sumArray(String[][] array) throws MyArrayDataException {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Сannot convert to int cell [" + i + "][" + j + "].");
                }
            }
        }
        return sum;
    }
}
