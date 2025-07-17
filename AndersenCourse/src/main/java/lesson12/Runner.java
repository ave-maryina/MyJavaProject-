package lesson12;

import java.io.File;
import java.io.IOException;

public class Runner {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\user\\Documents\\file1.csv");
        file.createNewFile();
        AppData appData = new AppData(new String[]{"Value 1", "Value 2", "Value 3"}, new int[][]{{100, 200, 123}, {300, 400, 500}});
        CSVSaver.save(file, appData);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.getMessage();
        }

        System.out.println(CSVLoader.load(file).toString());
    }
}
