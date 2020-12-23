package stringmethods.url;

public class UrlManager {
    private String protocol;
    private int port;
    private String host;
    private String path;
    private String query;

    public UrlManager(String url) {
        this.protocol = getProtocolFromUrl(url);
        this.port = 0;
        this.host = getHostFromUrl(url);
        this.path = "";
        this.query = "";
    }

    private String getProtocolFromUrl(String url) {
        if (url.indexOf(":") < 0 || url.substring(0, url.indexOf(":")).isBlank()) {
            throw new IllegalArgumentException("Invalid url");
        }
        return url.substring(0, url.indexOf(":")).toLowerCase();
    }

    private String getHostFromUrl(String url) {
        String host = "";
        int start = url.indexOf(":") + 3;
        int end = url.indexOf(":", start);
        if (end < 0) {
            end = url.indexOf("/", start);
        }
        if (end < 0) {
            host = url.substring(start, end).toLowerCase();
        }
        if (isEmpty(host)) {
            throw new IllegalArgumentException("Invalid url");
        }
        return host;

    }

    private boolean isEmpty(String str) {
        return str == null || str.isBlank();
    }

    public String getProtocol() {
        return protocol;
    }

    public int getPort() {
        return port;
    }

    public String getHost() {
        return host;
    }

    public String getPath() {
        return path;
    }

    public String getProperty(String key) {
        return "";
    }

    public boolean hasProperty(String key) {
        return true;

    }
}
