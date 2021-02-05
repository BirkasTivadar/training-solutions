package week14d05;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hachiko {

    private List<String> load(String fileName) {
        List<String> lines;
        Path file = Path.of(fileName);
        try {
            lines = Files.readAllLines(file);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read");
        }
        return lines;
    }

    public Map<String, Integer> countWords(String filename, String... words) {
        Map<String, Integer> result = new HashMap<>();
        List<String> lines = load(filename);
        int[] counts = new int[words.length];
        for(String line : lines){
            for(int i = 0; i< words.length; i++){
                if(line.contains(words[i])){
                    counts[i]++;
                }
            }
        }
        for (int i=0; i< words.length;i++){
            result.put(words[i], counts[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        Hachiko hachiko = new Hachiko();
        System.out.println(hachiko.countWords("hachiko.srt", "Hachiko", "haza",
                "pályaudvar", "jó"));
    }


}
