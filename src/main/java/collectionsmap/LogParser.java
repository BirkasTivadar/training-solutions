package collectionsmap;

import java.time.LocalDate;
import java.util.*;

public class LogParser {

    private LocalDate parseDate(String date) {
        String[] dateArr = date.split("-");
        int year = Integer.parseInt(dateArr[0]);
        int month = Integer.parseInt(dateArr[1]);
        int day = Integer.parseInt(dateArr[2]);
        return LocalDate.of(year, month, day);
    }


    public Map<String, List<Entry>> parseLog(String log) {
        Map<String, List<Entry>> result = new HashMap<>();
        try (Scanner scanner = new Scanner(log)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] lineArr = line.split(":");
                if (lineArr.length != 3) {
                    throw new IllegalArgumentException("Incorrect log: incorrect number of fields");
                }
                try {
                    LocalDate date = parseDate(lineArr[1]);
                } catch (Exception e) {
                    throw new IllegalArgumentException("Incorrect log: incorrect date", e);
                }
                Entry entry = new Entry(lineArr[0], parseDate(lineArr[1]), lineArr[2]);
                loadMap(result, entry);
            }
        }
        return result;
    }


    private void loadMap(Map<String, List<Entry>> elements, Entry entry) {
        if (!elements.containsKey(entry.getIpAddress())) {
            elements.put(entry.getIpAddress(), new ArrayList<>());
        }
        elements.get(entry.getIpAddress()).add(entry);
    }
}
