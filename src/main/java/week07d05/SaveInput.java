package week07d05;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class SaveInput {

    public void saveThreeLines() {
        Scanner scanner = new Scanner(System.in);
        String[] lines = new String[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Kérem az " + (i + 1) + "-ik sort:");
            String line = scanner.nextLine();
            lines[i] = line;
        }
        System.out.println("Kérem a fájl nevét:");
        String file = scanner.nextLine();

        saveToFile(file, lines);

    }

    private void saveToFile(String filename, String... lines) {
        Path file = Path.of(filename);
        try (BufferedWriter writer = Files.newBufferedWriter(file)) {
            for (String line : lines) {
                writer.write(line + "\n");
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not write file", ioe);
        }
    }

    public static void main(String[] args) {

        SaveInput saveInput = new SaveInput();
        saveInput.saveThreeLines();
    }
}
