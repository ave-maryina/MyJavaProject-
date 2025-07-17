package lesson12;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CSVLoader {
    public static AppData load(File file) throws IOException {
        if (!file.exists()) {
            throw new IOException("File not found: " + file.getPath());
        }

        List<String> lines = Files.readAllLines(Paths.get(file.getPath()));

        String[] header = lines.get(0).split(";");

        List<int[]> dataList = new ArrayList<>();
        for (int i = 1; i < lines.size(); i++) {
            String[] data = lines.get(i).split(";");
            int[] row = new int[data.length];
            for (int j = 0; j < data.length; j++) {
                try {
                    row[j] = Integer.parseInt(data[j].trim());
                } catch (NumberFormatException e) {
                    e.getMessage();
                }
            }
            dataList.add(row);
        }
        return new AppData(header, dataList.toArray(new int[0][]));

    }
}
