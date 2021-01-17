package week11d04;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FilesSum {

    private int sumNumbers() {

        int number = 0;
return 0;
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
