import java.util.Random;
import java.util.Scanner;

public class chatbot1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi, I'm a chatbot. What's your name?");
        String name = scanner.nextLine();
        System.out.println("Nice to meet you, " + name + "!");
        System.out.println("How can I assist you today?");

        while (true) {
            //System.out.println("How can I assist you now?");//
            String input = scanner.nextLine().toLowerCase();
            String[] tokens = input.split("\\s+");

            if (contains(tokens, "hi") || contains(tokens, "hello") || contains(tokens, "hey")) {
                System.out.println("Hello, " + name + "!");
            } 
            else if (contains(tokens, "how") && contains(tokens, "are") && contains(tokens, "you?")) {
                System.out.println("I'm a chatbot, I don't have feelings.");
            } 
            else if (contains(tokens, "what") && contains(tokens, "is") && contains(tokens, "your") && contains(tokens, "name?")) {
                System.out.println("My name is Chatbot.");
            } 
            else if (contains(tokens, "thank") || contains(tokens, "thanks")) {
                System.out.println("You're welcome!");
            } 
            else if (contains(tokens, "bye") || contains(tokens, "goodbye")) {
                System.out.println("Goodbye, " + name + "!");
                break;
            } 
            else if (contains(tokens, "generate") && contains(tokens, "number")) {
                int randomNum = getRandomNumber();
                System.out.println("The random number is " + randomNum + ".");
            } 
            else {
                System.out.println("I'm not sure, let me check it for you.");
            }
        }
        scanner.close();
    }

    private static boolean contains(String[] tokens, String word) {
        for (String token : tokens) {
            if (token.equalsIgnoreCase(word)) {
                return true;
            }
        }
        return false;
    }

    private static int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(100);
    }
}
