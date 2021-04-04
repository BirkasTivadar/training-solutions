package week08d04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ExamplesStore {

    public List<String> getTitlesOfExamples() {
        List<String> result = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(
                ExamplesStore.class.getResourceAsStream("examples.md")))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.startsWith("#")) {
                    br.readLine();
                    StringBuilder sb = new StringBuilder(br.readLine());
                    sb.append(" ").append(br.readLine());
                    result.add(sb.toString());
                }
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new ExamplesStore().getTitlesOfExamples());
        System.out.println(new ExamplesStore().getTitlesOfExamples().size());
    }
}
