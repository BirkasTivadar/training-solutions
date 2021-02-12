package iofilestest.cheese;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class CheeseManager {

    public void saveToFile(Path path, List<Cheese> cheeses) {
        try (DataOutputStream os = new DataOutputStream(new BufferedOutputStream(Files.newOutputStream(path)))) {
            for (Cheese cheese : cheeses) {
                os.writeUTF(cheese.getName());
                os.writeDouble(cheese.getLactoseContent());
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not write", ioe);
        }
    }


    public Cheese findCheese(Path path, String cheeseName) {
        try (DataInputStream dis = new DataInputStream(new BufferedInputStream(Files.newInputStream(path)))) {
            boolean notFinish = true;
            while (notFinish) {
                try {
                    String name = dis.readUTF();
                    double lactoseContent = dis.readDouble();
                    if (name.equals(cheeseName)) {
                        return new Cheese(name, lactoseContent);
                    }
                } catch (IOException ioe) {
                    throw new IllegalArgumentException("Wrong cheesename", ioe);
                }
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read", ioe);
        }
        throw new IllegalArgumentException("Wrong name");
    }


    public static void main(String[] args) {
        List<Cheese> cheeses = Arrays.asList(
                new Cheese("manchego", 23.54),
                new Cheese("queso", 13.23),
                new Cheese("trappista", 6.72),
                new Cheese("edami", 10.00)
        );

        Path path = Path.of("cheese.dat");
        CheeseManager cheeseManager = new CheeseManager();
        cheeseManager.saveToFile(path, cheeses);
        System.out.println(cheeseManager.findCheese(path, "edami"));

    }
}
