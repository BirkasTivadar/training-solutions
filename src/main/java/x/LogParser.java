package x;

import java.time.LocalDate;
import java.util.*;

public class LogParser {

    public Map<String, List<Entry>> parseLog(String log) {
        Map<String, List<Entry>> result = new HashMap<>();

        try (Scanner scanner = new Scanner(log)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                Entry entry = entryCreate(line);

                if (!result.containsKey(entry.getIpAddress())) {
                    result.put(entry.getIpAddress(), new ArrayList<Entry>());
                }
                result.get(entry.getIpAddress()).add(entry);
            }
        }
        return result;
    }

    private Entry entryCreate(String line){
        String[] lineArr = line.split(":");

        if (lineArr.length != 3) {
            throw new IllegalArgumentException("Incorrect log: incorrect number of fields");
        }

        String ip = lineArr[0];
        String login = lineArr[2];
        LocalDate date = dateCreate(lineArr[1]);

        return new Entry(ip, login, date);
    }


    private LocalDate dateCreate(String str) {
        LocalDate date;
        try {
            int year = Integer.parseInt(str.split("-")[0]);
            int month = Integer.parseInt(str.split("-")[1]);
            int day = Integer.parseInt(str.split("-")[2]);
            date = LocalDate.of(year, month, day);
        } catch (Exception e) {
            throw new IllegalArgumentException("Incorrect log: incorrect date", e);
        }
        return date;
    }
}
