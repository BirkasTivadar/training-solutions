package training;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class FileScannerMain {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(Path.of("employees.txt"))) {
            while (scanner.hasNextLine()){
                String row = scanner.nextLine();
                System.out.println(row);
            }
        } catch (IOException ie) {
            ie.printStackTrace();
        }
    }
}
