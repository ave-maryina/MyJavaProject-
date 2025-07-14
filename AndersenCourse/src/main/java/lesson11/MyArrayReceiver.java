package lesson11;

public class MyArrayReceiver {
    public static void arrayReceiver(String[][] array) throws MyArraySizeException {
        if (array.length != 4 || array[0].length != 4) {
            throw new MyArraySizeException();
        } else {
            System.out.println("Array accepted.");
        }
    }
}
