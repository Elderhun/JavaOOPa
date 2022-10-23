package DZ5.http_server.logger;

class LoggerImpl implements Logger {

    @Override
    public void log(String msg) {
        System.out.println(msg);
    }
}
