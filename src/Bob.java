import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");

        System.out.print("Talk to Bob! ");
        String message = input.next();
        String bobSays;

        boolean isQuestion = message.endsWith("?");
        boolean isYelling = message.equals(message.toUpperCase()) || message.endsWith("!");
        boolean isEmpty = message.trim().equals("");

        if(isQuestion) {
            bobSays = "Sure.";
        } else if(isEmpty){
            bobSays = "Fine. Be that way!";
        } else if(isYelling) {
            bobSays = "Whoah, chill out!";
        } else {
            bobSays = "Whatever.";
        }

        System.out.println(bobSays);

    }
}
