package iowritestring.school;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

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

        }}

        public static void main (String[]args){
            Diary diary = new Diary();
            diary.newMark("Bibi", 4);
            diary.newMark("Bibi", 5);
            diary.newMark("Jimmy", 2);
        }
    }
