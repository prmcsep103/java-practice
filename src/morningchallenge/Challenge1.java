package morningchallenge;

import java.util.Scanner;

public class Challenge1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter Greetings Message: ");
        String message = scanner.nextLine();
        printMessage(name, message);
        scanner.close();
    }

    public static void printMessage(String name, String message){
        System.out.println("Hi " + name);
        System.out.println(message);
    }

}
