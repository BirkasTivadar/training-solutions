package x;

import ioreadstring.names.Human;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileManager {
    private Path myFile;
    private List<Human> humans = new ArrayList<>();

    public FileManager(String path) {
        this.myFile = Path.of(path);
    }

    public List<Human> getHumans() {
        return List.copyOf(humans);
    }

    public Path getMyFile() {
        return myFile;
    }

    public void readFromFile() {
        try {
            List<String> humansInString = Files.readAllLines(myFile);
            for (String s : humansInString) {
                String[] namesOfOneHuman = s.split(" ");
                Human human = new Human(namesOfOneHuman[0], namesOfOneHuman[1]);
                humans.add(human);
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can not read file.", e);
        }
    }
}
