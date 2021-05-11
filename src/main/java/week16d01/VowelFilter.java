package week16d01;

import java.io.BufferedReader;
import java.io.IOException;

public class VowelFilter {

    public static final String VOWELS = "aáeéiíoóöőuúüűAÁEÉIÍOÓÖŐUÚÜŰ";


    public String filterVowels(BufferedReader reader) throws IOException {

        StringBuilder sb = new StringBuilder();

        String line;

        while ((line = reader.readLine()) != null) {
            filter(sb, line);
            sb.append("\n");
        }

        return sb.substring(0, sb.toString().length() - 1);
    }


    private void filter(StringBuilder sb, String line) {
        for (char c : line.toCharArray()) {
            if (!VOWELS.contains(Character.toString(c))) {
                sb.append(c);
            }
        }
    }

}
