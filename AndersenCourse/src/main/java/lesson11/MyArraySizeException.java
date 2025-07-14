package lesson11;

public class MyArraySizeException extends Exception {
    @Override
    public String getMessage() {
        return "Only 4x4 array size allowed!";
    }
}
