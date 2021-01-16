package iostringwriter.longwords;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.List;

public class LongWordService {

    public String writeWithStringWriter(Writer writer, List<String> words) {
        try (writer) {
            for (String word : words) {
                writer.write(word);
                writer.write(" ");
                writer.write("" + word.length());
                writer.write("\n");
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not close this writer.", ioe);
        }
        return writer.toString();
    }

    public String writeWithStringWriter(List<String> words) {
        StringWriter sw = new StringWriter();
        return writeWithStringWriter(sw, words);
    }
}
