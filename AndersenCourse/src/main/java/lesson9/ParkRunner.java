package lesson9;

public class ParkRunner {

    public static void main(String[] args) {
        Park park = new Park(3);
        park.addAttraction("Super8", "10.00 - 23.00", 19.99);
        park.addAttraction("FerrisWheel", "10.30 - 22.00", 15);
        park.addAttraction("Waltz", "11.00 - 22.30", 10.05);
        park.printAttrInfo();
    }
}
