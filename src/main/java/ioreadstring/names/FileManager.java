package ioreadstring.names;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileManager {
    List<Human> humans = new ArrayList<>();

    private Path myFile;

    public FileManager(String file) {
        this.myFile = Path.of(file);
    }

    public Path getMyFile() {
        return myFile;
    }

    public List<Human> getHumans() {
        return new ArrayList<>(humans);
    }

    public void readFromFile() {
        try {
            List<String> names = Files.readAllLines(myFile);
            for (String name : names) {
                String firstName = name.split(" ")[0];
                String lastName = name.split(" ")[1];
                humans.add(new Human(firstName, lastName));
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }
}
