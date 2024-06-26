public class AppConfig {

    private static AppConfig instance;
    private String serverUrl;
    private int port;

    private AppConfig(String serverUrl, int port) {
        this.serverUrl = serverUrl;
        this.port = port;
    }

    public String getServerUrl() {
        return serverUrl;
    }

    public void setServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }


    public static synchronized AppConfig getInstance(String serverUrl, int port) {
        if (instance == null) {
            instance = new AppConfig(serverUrl, port);
        }
        return instance;
    }

}
