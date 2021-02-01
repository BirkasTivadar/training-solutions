package x;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.util.Properties;

public class PropertiesTest {

    @Test
    void testProperties() {
        Properties p = new Properties();
        p.setProperty("host", "training360.com");
        assertEquals("training360.com", p.getProperty("host"));
        assertEquals(null, p.getProperty("port"));
        assertEquals("80", p.getProperty("port", "80"));
    }

    @Test
    void testLoad() {
        Properties p = new Properties();
        try (InputStream is = PropertiesTest.class.getResourceAsStream("/welcome.properties")) {
            p.load(is);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read", ioe);
        }

        String value = p.getProperty("welcome.message");
        assertEquals("Hello World!", value);
    }

    @Test
    void testSave() {
        Properties properties = new Properties();
        properties.setProperty("host", "training360.com");
        properties.setProperty("port", "80");

        try (Writer writer = new FileWriter("config.properties")) {
            properties.store(writer, null);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not write", ioe);
        }
    }
}
