/*
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */

import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        int randomNumber = gamePickNumber();
        int guess;        // All user inputs are validated
        do {
            guess = userPickNumber();
            if (guess < randomNumber) {
                System.out.println("HIGHER");
            } else if (guess > randomNumber) {
                System.out.println("LOWER");
            } else {
                System.out.println("GOOD GUESS!");
            }
        } while (guess != randomNumber);
    }
    public static int gamePickNumber() {
        return (int) (Math.random() * 100) + 1;
    }
    public static int userPickNumber() {
        Scanner input = new Scanner(System.in);
        System.out.println("Guess the number");
        return input.nextInt();
    }
}
