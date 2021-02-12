package week15d05;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class BattleCounter {
    List<String> lines = new ArrayList<>();
    private Set<String> houseSet = new HashSet<>();
    List<House> houses = new ArrayList<>();

    public BattleCounter(String fileName) {
        loadFile(fileName);
    }

    public List<String> getLines() {
        return lines;
    }

    public List<House> getHouses() {
        return houses;
    }

    public Set<String> getHouseSet() {
        return houseSet;
    }

    private void loadHousesSet() {
        for (String line : lines) {
            if (line.contains(", ")) {
                line = line.replace(", ", "-");
            }
            String[] lineArr = line.split(",");
            for (int i = 3; i <= 12; i++)
                if (lineArr[i].contains(" ")) {
                    houseSet.add(lineArr[i].split(" ")[1]);
                } else {
                    houseSet.add(lineArr[i]);
                }
        }
    }

    private void loadHousesList() {
        for (String house : houseSet) {
            houses.add(new House(house, 0));
        }
    }

    private void loadHousesBattle() {
        for (String line : lines) {
            for (House house : houses) {
                if (line.contains(house.getName())) {
                    house.incrementBattle();
                }
            }
        }
    }

    public void loadFile(String fileName) {
        Path path = Path.of(fileName);
        try (BufferedReader br = Files.newBufferedReader(path)) {
            String line = br.readLine();
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read", ioe);
        }
    }

    public House mostBattle() {
        loadHousesSet();
        loadHousesList();
        loadHousesBattle();
        List<House> temp = new ArrayList<>(houses);
        Collections.sort(temp);
        return temp.get(0);
    }

    public static void main(String[] args) {
        BattleCounter battleCounter = new BattleCounter("battles.csv");

        System.out.println(battleCounter.mostBattle());
    }
}

