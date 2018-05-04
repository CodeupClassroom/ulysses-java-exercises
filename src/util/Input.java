/*
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */
package util;

import java.util.Scanner;

public class Input {
    // option 1) Inline the assignment
    // private Scanner scanner = new Scanner(System.in);  // = null
    private  Scanner scanner;

    // option 2 -> Create a constructor
    public Input() {
        scanner = new Scanner(System.in);
    }
    public String getString() {
        return scanner.nextLine();
    }
    boolean yesNo() {
        String answer = scanner.nextLine();  // null
        // auto-boxing => value (string) -> wrap it in a an object -> new String("y").equalsIgnoreCase()
        return "y".equalsIgnoreCase(answer) || "yes".equalsIgnoreCase(answer);
    }
    int getInt(int min, int max) {
        int value = getInt();
        if (value < min || value > max) {
            System.out.printf("Enter a number between %d and %d%n", min, max);
            return getInt(min, max);
        }
        return value;
    }
    int getInt() {
        return scanner.nextInt();
    }
    double getDouble(double min, double max) {
        double value = getDouble();
        if (value < min || value > max) {
            System.out.printf("Enter a number between %f and %f%n", min, max);
            return getDouble(min, max);
        }
        return value;
    }
    double getDouble() {
        return scanner.nextDouble();
    }
}
