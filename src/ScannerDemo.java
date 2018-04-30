import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        String userInput;

        // declaring a variable
        Scanner sc;

        // assigning a new scanner object to the sc , add .useDelimeter("\n") to avoid some trouble :)
        sc = new Scanner(System.in).useDelimiter("\n");

        System.out.print("Enter something: ");
        userInput = sc.next(); // sc.next listened up until a space character.. but we still had the new line character

        System.out.println("You entered: --> \"" + userInput + "\" <--");
        System.out.println("===========");

        int favoriteNumber;
        System.out.print("Please input your favorite number: ");
        favoriteNumber = sc.nextInt();

        System.out.println("You entered the number: " + favoriteNumber);


    }
}
