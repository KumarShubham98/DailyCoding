package org.example;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class FilePath {
public static void main(String[] args) throws FileNotFoundException {

    String fileName = "/home/shubham";

    FileOutputStream fos = new FileOutputStream("shubham.txt",true);
    PrintWriter pw = new PrintWriter(fos);

    pw.println("Hello World");
    pw.close();
    System.out.println("Hello World");
    pw.close();
    System.out.println("File shubham.txt was written ");

}

}
