package DZ5.http_server;

import java.io.File;


// It`s my Home Work 2

public class MyPath {
    public String[] retPath() {

        String[] pathnames;


        File f = new File("C:\\Users\\Igor\\Desktop\\JavaOpa\\OOPJava\\Main");

        pathnames = f.list();

        return pathnames;
    }

//    public static void main(String[] args) {
//        MyPath paths = new MyPath();
//        String[] paths2 = paths.retPath();
//        for (String el: paths2) {
//            System.out.println(el);
//        }
//    }


}
