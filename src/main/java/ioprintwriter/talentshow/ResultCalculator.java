package ioprintwriter.talentshow;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ResultCalculator {

    List<Production> productions = new ArrayList<>();

    public List<Production> getProductions() {
        return productions;
    }

    public void readTalents(Path path) {
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line;
            while ((line = reader.readLine()) != null){
                String[] production = line.split(" ");
                productions.add(new Production(Integer.parseInt(production[0]), production[1]));
            }

        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read.", ioe);
        }
    }


}
