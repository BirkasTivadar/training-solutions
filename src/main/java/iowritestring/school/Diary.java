package iowritestring.school;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Diary {

    public void newMark(String name, int mark) {
        String fileName = name + ".txt";
        Path file = Path.of("src", "main", "resources", fileName);
        try {
            if (Files.exists(file)) {
                Files.writeString(file, mark + "\n", StandardOpenOption.APPEND);
            } else {
                Files.writeString(file, mark + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    public void average(String name) {
        String fileName = name + ".txt";
        Path file = Path.of("src", "main", "resources", fileName);
        try {
            List<String> marks = Files.readAllLines(file);
            double sum = 0;
            for (String mark : marks) {
                sum += Double.parseDouble(mark);
            }
            Files.writeString(file, "average: " + sum / marks.size(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new IllegalStateException("Can not read this file");
        }
    }

    public static void main(String[] args) {
        Diary diary = new Diary();
        diary.newMark("Bibi", 4);
        diary.newMark("Bibi", 5);
        diary.newMark("Jimmy", 2);
        diary.newMark("Jimmy", 1);
        diary.newMark("Bibi", 2);
        diary.average("Jimmy");
        diary.average("Bibi");
    }
}
