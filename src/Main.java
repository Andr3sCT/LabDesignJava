

public class Main {
    public static void main(String[] args) {
        AppConfig config = AppConfig.getInstance("http://miapi.com", 3306);
        config.setServerUrl("https://google.com");
        config.setPort(1080);

        System.out.println("URL del Servidor: " + config.getServerUrl());
        System.out.println("Port del Servidor: " + config.getPort());

        AppConfig config2 = AppConfig.getInstance("http://miapi.com", 3308);

        System.out.println("URL del Servidor 2: " + config2.getServerUrl());
        System.out.println("Port del Servidor 2: " + config2.getPort());

    }
}