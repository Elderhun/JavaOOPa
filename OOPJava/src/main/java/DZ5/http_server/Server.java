package DZ5.http_server;

import DZ5.http_server.logger.Logger;
import DZ5.http_server.logger.LoggerFactory;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

import static DZ5.http_server.IoProcessors.PROCESSORS;

public class Server {


    private static final String WWW = "C:\\Users\\Igor\\Desktop\\JavaOpa\\OOPJava\\Main";

    private static final Logger logger = LoggerFactory.create();

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8080)) {
            for (;;) {
                try (Socket socket = serverSocket.accept()) {
                    handleRequest(socket);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void handleRequest(Socket socket) throws IOException {
        logger.log("Client connected");
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        socket.getInputStream()));

        PrintStream writer = new PrintStream(
                socket.getOutputStream());

        PrintStream output = new PrintStream(
                socket.getOutputStream());

        while (!reader.ready()) ;

        String[] items = {"", "", ""};
        if (reader.ready()) {
            String line = reader.readLine();
            System.out.println(line);
            items = line.split(" ");

        }

        while (reader.ready()) {
            logger.log(reader.readLine());
        }
        Path filePath = Path.of(WWW, items[1]);


        for (Map.Entry<Predicate<Path>, BiConsumer<Path, PrintStream>> entry : PROCESSORS.entrySet()) {
            Predicate<Path> pred = entry.getKey();
            BiConsumer<Path, PrintStream> processor = entry.getValue();
            if (pred.test(filePath)) {
                processor.accept(filePath, writer);
                System.out.println(filePath);
                break;
            }
        }

        writer.flush();
    }




}
