package properties;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;

public class DatabaseConfiguration {
    private static final String UTF8 = "UTF-8";
    private String host;
    private int port;
    private String schema;

    public DatabaseConfiguration() {
        Properties properties = new Properties();
        try (InputStreamReader is = new InputStreamReader(DatabaseConfiguration.class.getResourceAsStream("/db.properties"), UTF8)) {
            properties.load(is);
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Cannot load file", ioe);
        }
        this.host = properties.getProperty("db.host");
        this.port = Integer.parseInt(properties.getProperty("db.port"));
        this.schema = properties.getProperty("db.schema");
    }

    public DatabaseConfiguration(File file) {
        Path path = file.toPath();
        Properties properties = new Properties();
        try (InputStream is = Files.newInputStream(path)) {
            properties.load(is);
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Cannot read file", ioe);
        }
        this.host = properties.getProperty("db.host");
        this.port = Integer.parseInt(properties.getProperty("db.port"));
        this.schema = properties.getProperty("db.schema");
    }

    public String getHost() {
        return host;
    }

    public int getPort() {
        return port;
    }

    public String getSchema() {
        return schema;
    }
}
