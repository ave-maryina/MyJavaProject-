package arraySwap;

public class Runner {
    public static void main(String[] args) {
        Object[] objects = new Object[5];
        objects[0] = new Object();
        objects[1] = new Object();
        objects[2] = new Object();
        objects[3] = new Object();
        objects[4] = new Object();

        for (Object o : objects) {
            System.out.println(o.toString());
        }

        ArraySwapper.swapElements(objects, 0, 3);
        System.out.println();

        for (Object o : objects) {
            System.out.println(o.toString());
        }
    }
}
