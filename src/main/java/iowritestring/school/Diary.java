package iowritestring.school;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Diary {

    public void newMark(String name, int mark){
        String fileName = name+".txt";
        Path file = Path.of(fileName);
        try {
            Files.writeString(file, mark+"\n");
        } catch (IOException e) {
            throw new IllegalStateException("Can not write this file.");
        }

    }
}
