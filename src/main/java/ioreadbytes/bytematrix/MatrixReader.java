package ioreadbytes.bytematrix;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class MatrixReader {

    private List<byte[]> myMatrix = new ArrayList<>();

    public List<byte[]> getMyMatrix() {
        return new ArrayList<>(myMatrix);
    }


    public void readBytesAndCreateMatrix(String file) {
        Path path = Path.of(file);
        try (InputStream inputStream = Files.newInputStream(path)) {
            byte[] bytes = new byte[1000];
            int size;
            while ((size = inputStream.read(bytes)) == 1000) {
                myMatrix.add(bytes);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read.", ioe);
        }
    }

    public int numberOfColumnsWhereMoreZeros() {
        int result = 0;
        for (int column = 0; column < 1000; column++) {
            if (isMoreZero(column)) {
                result++;
            }
        }
        return result;
    }

    private boolean isMoreZero(int column) {
        int moreThanHalf = myMatrix.size() / 2;
        int counter = 0;
        for (int i = 0; i < myMatrix.size(); i++) {
            if (myMatrix.get(i)[column] == 48) {
                counter++;
                if (counter > moreThanHalf) {
                    return true;
                }
            }
        }
        return false;
    }
}
