package week12d03;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberStat {

    private List<Integer> numbers;

    public NumberStat(List<Integer> numbers) { // Teszthez
        this.numbers = new ArrayList<>(numbers);
    }

    public int smallestUnique() {

        if (numbers == null || numbers.size() < 1) {
            throw new IllegalArgumentException("List is empty.");
        }

        if (numbers.size() == 1) {
            return numbers.get(0);
        }

        List<Integer> sortedNumbers = new ArrayList<>(numbers);
        Collections.sort(sortedNumbers);

        if (numbers.size() == 2 && numbers.get(0) != numbers.get(1)) {
            return numbers.get(0);
        }

        for (int i = 1; i < sortedNumbers.size() - 1; i++) {
            if (sortedNumbers.get(i) != sortedNumbers.get(i - 1) && sortedNumbers.get(i) != sortedNumbers.get(i + 1)) {
                return sortedNumbers.get(i);
            }
        }

        if (sortedNumbers.get(sortedNumbers.size() - 1) != sortedNumbers.get(sortedNumbers.size() - 2)) {
            return sortedNumbers.get(sortedNumbers.size() - 1);
        }

        throw new IllegalStateException("Wrong list.");
    }


    public void readFromFile(String directoryOrFile, String... directoriesAndFile) {

        Path path = Path.of(directoryOrFile);

        if (directoriesAndFile.length > 0) {
            for (String dir : directoriesAndFile) {
                path = path.resolve(dir);
            }
        }

        try (BufferedReader br = Files.newBufferedReader(path)) {

            String line;

            while ((line = br.readLine()) != null) {
                String[] numbersString = line.split(",");
                loadList(numbersString);
            }

        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read this file", ioe);
        }
    }


    private void loadList(String[] numbersString) {
        for (String number : numbersString) {
            numbers.add(Integer.parseInt(number));
        }
    }
}
