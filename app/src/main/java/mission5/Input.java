package mission5;

import java.util.Scanner;

public class Input {

    public static final Scanner scanner = new Scanner(System.in);

    public String command() {
        System.out.println("nosh> ");
        String userInput = scanner.nextLine();
        String[] commands = userInput.split(" ");
        return commands[0];
    }
}
