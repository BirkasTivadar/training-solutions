package iowritebytes;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class ImageAssembler {

    public void makeImageFile(byte[][] byteArrays, Path path) {
        try (OutputStream os = new BufferedOutputStream(Files.newOutputStream(path))) {
            for(byte[] bytaArray:byteArrays){
                os.write(bytaArray);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not write.", ioe);
        }
    }
}
