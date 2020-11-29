package stringmethods.url;

public class UrlManager {
    private String protocol;
    private int port;
    private String host;
    private String path;
    private String query;

    public UrlManager(String url) {
        this.protocol = protocol;
        this.port = port;
        this.host = host;
        this.path = path;
        this.query = query;
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

    public void validateString(String str) {
        if (str == null || str.isBlank()) {
            throw new IllegalArgumentException("Parameter must be not empty.");
        }
    }

    public String getProcotolFromUrl(String url) {
        int end = url.indexOf(":");
        if (end < 0 || url.substring(0, end).isBlank()) {
            throw new IllegalArgumentException("Invalid url");
        }
        return url.substring(0, end).toLowerCase();
    }

    private String getHostFromUrl(String url) {
        String host = "";
        int start = url.indexOf("://") + 3;
        int end = url.indexOf(":", start);
        if (end == -1) {
            end = url.indexOf("/", start);
        }
        if (end == -1) {
            host = url.substring(start).toLowerCase();
        }
        if (host.isBlank()) {
            throw new IllegalArgumentException("invalid url");
        }
        return host;
    }

    private Integer getPortFromUrl(String url) {
        int start = url.indexOf("://") + 3;
        start = url.indexOf(":", start);
        if (start == -1) {
            return null;
        }
        int end = url.indexOf("/", start);
        if (end == -1) {
            return Integer.valueOf(url.substring(start + 1));
        }
        return Integer.valueOf(url.substring(start+1, end));
    }



    public boolean hasProperty(String key) {
        validateString(key);
        return query.startsWith(key + "=") || query.contains("&" + key + "=");
    }
/*
    public String getProperty(String key){
        validateString(key);
        for(String str : properties)

    }*/

// https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&starttime=2014-01-01&endtime=2014-01-02
}
