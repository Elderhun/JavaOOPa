package DZ5.http_server.logger;

public class LoggerFactory {

    public static Logger create() {
        return new LoggerImpl();
    }
}
