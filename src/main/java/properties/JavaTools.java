package properties;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;

public class JavaTools {

    private Properties p = new Properties();

    public JavaTools() {
        loadProperties("javatools.properties");
    }

    public Properties getP() {
        return p;
    }

    public Set<String> getToolKeys() {
        Set<String> result = new HashSet<>();
        Set<String> temp;
        temp = p.stringPropertyNames();
        for (String str : temp) {
            String key = str.substring(0, str.indexOf("."));
            result.add(key);
        }
        return result;
    }

    public Set<String> getTools() {
        Set<String> result = new HashSet<>();
        Set<String> temp;
        temp = p.stringPropertyNames();
        for (String str : temp) {
            if (str.contains("name")) {
                result.add(p.getProperty(str));
            }
        }
        return result;
    }

    public String getName(String str) {
        return p.getProperty(str.concat(".").concat("name"));
    }

    public String getUrl(String str) {
        return p.getProperty(str.concat(".").concat("url"));
    }


    public void loadProperties(String fileName) {
        Path path = Path.of(fileName);
        try (BufferedReader br = Files.newBufferedReader(path)) {
            String line;
            while ((line = br.readLine()) != null) {
                p.setProperty(line.split("=")[0], line.split("=")[1]);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    public static void main(String[] args) {
        JavaTools javaTools = new JavaTools();
        System.out.println(javaTools.getP());
        System.out.println(javaTools.getToolKeys());
        System.out.println(javaTools.getP().getProperty("junit.name"));
    }
}
