package exceptions;

import java.util.ArrayList;
import java.util.List;

public class FaultList {

    public List<String> processLines(List<String> lines) {
        List<String> result = new ArrayList<>();
        int rowCounter = 0;
        if (lines == null || lines.size() < 1) {
            throw new IllegalArgumentException();
        }
        for (String line : lines) {
            rowCounter++;
            StringBuilder str = new StringBuilder();
            String[] dataArray = line.split(",");
            if (dataArray.length != 3) {
                str.append(dataArray[0]).append(",").append(ProcessingResult.WORD_COUNT_ERROR.getCodeNumber());
            }
        }

        return result;
    }

}
