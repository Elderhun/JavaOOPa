package DZ6.http_server2.logger;

public class LoggerFactory {

    public static Logger create() {
        return new LoggerImpl();
    }
}
