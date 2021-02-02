package week14d02;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class OnlineShopping {
    private Map<String, List<String>> shoppingMap = new HashMap<>();


    public Map<String, List<String>> getShoppingMap() {
        return shoppingMap;
    }

    public void loadFile(String filename) {
        Path path = Path.of(filename);

        try (BufferedReader bf = Files.newBufferedReader(path)) {
            String line;
            while ((line = bf.readLine()) != null) {
                addMap(line);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Something went wrong", ioe);
        }
    }

    private void addMap(String line) {
        String key = line.split(" ")[0];
        String[] productA = line.split(" ")[1].split(",");
        List<String> products = new ArrayList<>(Arrays.asList(productA));
        Collections.sort(products);
        shoppingMap.put(key, products);
    }

    public List<String> search(String iD) { // 1. feladat
        if (!(shoppingMap.containsKey(iD))) {
            throw new IllegalArgumentException("Invalid Key");
        }
        return shoppingMap.get(iD);
    }

    public int productCounter(String productName) { // 2. feladat
        int counter = 0;
        for (String item : shoppingMap.keySet()) {
            if (search(item).contains(productName)) {
                counter++;
            }
        }
        return counter;
    }

    public int numberOfProducts(String ID) { // 3. feladat
        return search(ID).size();
    }

    public Map<String, Integer> listOfProduct() { // 4. feladat
        Set<String> products = new HashSet<>();
        for (List<String> items : shoppingMap.values()) {
            for (String item : items) {
                products.add(item);
            }
        }
        Map<String, Integer> result = new HashMap<>();
        for (String item : products) {
            int number = productCounter(item);
            result.put(item, number);
        }
        return result;
    }

}
