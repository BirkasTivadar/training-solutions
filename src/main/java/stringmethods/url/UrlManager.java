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

    public void validateString(String str){
        if(str == null || str.isBlank()){
            throw new IllegalArgumentException("Parameter must be not empty.");
        }
    }

    public boolean hasProperty(String key){
        validateString(key);
        return query.startsWith(key + "=") || query.contains("&"+ key + "=");
    }

// https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&starttime=2014-01-01&endtime=2014-01-02
}
