package lesson12;

import java.io.*;


public class CSVSaver {
    public static void save(File file, AppData appData) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file.getPath()))) {
            writer.write(String.join(";", appData.getHeader()));
            writer.newLine();

            for (int[] row : appData.getData()) {
                StringBuilder rowString = new StringBuilder();
                for (int i = 0; i < row.length; i++) {
                    rowString.append(row[i]);
                    if (i < row.length - 1) {
                        rowString.append(";");
                    }
                }
                writer.write(rowString.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
            e.getMessage();
        }
    }
}
