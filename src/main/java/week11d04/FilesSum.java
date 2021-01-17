package week11d04;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FilesSum {

    private int sumNumbers() {
        int sum = 0;
        String fileName;
        for (int i = 0; i < 100; i++) {
            fileName = this.createFilename(i);
            if (Files.isRegularFile(Path.of(fileName))) {
                sum += read(fileName);
            }
        }
        return sum;
    }

    private int read(String fileName) {
        Path path = Path.of(fileName);
        int result = 0;
        try {
            result = Integer.parseInt(Files.readString(path));
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Can not read.", ioe);
        }
        return result;
    }


    private String createFilename(int i) {
        if (i < 10) {
            return "number0" + i + ".txt";
        } else {
            return "number" + i + ".txt";
        }
    }

    public static void main(String[] args) {
        FilesSum filesSum = new FilesSum();
        System.out.println(filesSum.createFilename(1));
        System.out.println(filesSum.createFilename(31));
    }
}
