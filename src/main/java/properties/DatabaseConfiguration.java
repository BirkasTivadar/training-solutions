package properties;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DatabaseConfiguration {
    private String host;
    private String port;
    private String schema;

    public DatabaseConfiguration() {
        Properties properties = new Properties();
        try (InputStream is = DatabaseConfiguration.class.getResourceAsStream("/db.properties")) {
            properties.load(is);
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot load file", ioe);
        }
        this.host = properties.getProperty("host");
        this.port = properties.getProperty("port");
        this.schema = properties.getProperty("schema");
    }

    public String getHost() {
        return host;
    }

    public String getPort() {
        return port;
    }

    public String getSchema() {
        return schema;
    }
}
