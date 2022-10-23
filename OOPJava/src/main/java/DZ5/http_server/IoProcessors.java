package DZ5.http_server;

import java.io.*;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class IoProcessors extends Thread {

    private static final Map<String, String> CONTENT_TYPES = new HashMap<>() {{
        put("jpg", "image/jpeg");
        put("html", "text/html");
        put("txt", "text/plain");
        put("", "text/plain");
    }};

    public static final Map<Predicate<Path>, BiConsumer<Path, PrintStream>> PROCESSORS = Map.of(




//            Files::notExists,
//            (Path, writer) -> {
//                    writer.println("HTTP/1.1 200 OK");
//                    writer.println("Content-Type: text/html");
//                    writer.println();
//                    writer.println("<h1>File " + Path + "not found</h1>");
//
//            },


            Files::isDirectory,
            (Path, writer) -> {
                writer.println("HTTP/1.1 200 OK");
                writer.println("Content-Type: text/html");
                writer.println();
                writer.println("<h1>It's directory</h1>");

                MyPath myPath = new MyPath();
                String[] fileList = myPath.retPath();
                for (String el:fileList) {
                    writer.println();
                    writer.printf("<h1><a href=%s/>%s%n</a></h1>", el, el);
                }

            },


            Files::isRegularFile,
            (Path, writer) -> {
                    String name = Path.getFileName().toString();
                    int ex = name.lastIndexOf(".");
                    String ct = name.substring(ex + 1);
                    String type = CONTENT_TYPES.get(ct);
                try {
                    var fileBytes = Files.readAllBytes(Path);
                    writer.println("HTTP/1.1 200 OK");
                    writer.printf("Content-Type: %s%n", type);
                    writer.println();
                    writer.write(fileBytes);

                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            },


            path -> !Files.isReadable(path),
            (Path, writer) -> {
                writer.println("HTTP/1.1 403 OK");
                writer.println("Content-Type: text/html");
                writer.println();
                writer.println("<h1>File not readable</h1>");
            }



    );



}
