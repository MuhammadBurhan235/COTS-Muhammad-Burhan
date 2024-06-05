package com.mycompany.app;

/**
 * Hello world!
 */
public class App {

    private static final String pesan = "Hello World!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(pesan);
    }

    public String getMessage() {
        return pesan;
    }
}
