package exceptiondemo;

import java.io.FileReader;

public class UncheckedExceptionExample {
    public static void readFile(String fileName) {

        try {
            FileReader reader = new FileReader(fileName);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void readJungleBooke(String fileName) {
        readFile(fileName);
    }

    public static void main(String[] args) {
        readJungleBooke("MyBook");
    }
}
