package iowriter.names;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class NameWriter {

    private Path path;

    public NameWriter(Path path) {
        this.path = path;
    }

    public void addAndWrite(String str) {
        try (BufferedWriter writer = Files.newBufferedWriter(path, StandardOpenOption.APPEND)) {
            writer.write(str);
            writer.newLine();
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not write this file: " + path);
        }
    }
}
