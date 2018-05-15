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
        scanner = new Scanner(System.in).useDelimiter("\n");
    }

    public String getString() {
        return scanner.next();
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        return getString();
    }

    public boolean yesNo() {
        String answer = scanner.next();  // null
        // auto-boxing => value (string) -> wrap it in a an object -> new String("y").equalsIgnoreCase()
        return "y".equalsIgnoreCase(answer) || "yes".equalsIgnoreCase(answer);
    }

    public boolean yesNo(String prompt) {
        System.out.print(prompt);
        return yesNo();
    }

    public int getInt(int min, int max) {
        System.out.println("Enter an integer between " + min + " and " + max);
        int value = getInt();
        if (value < min || value > max) {
            return getInt(min, max);
        }
        return value;
    }

    public int getInt() {
        String input = getString();

        try {
            return Integer.valueOf(input);
        } catch(NumberFormatException e) {
            System.out.println("Must input an integer.");
            return getInt();
        }
    }

    public double getDouble(double min, double max) {
        System.out.printf("Enter a number between %f and %f%n", min, max);
        double value = getDouble();
        if (value < min || value > max) {
            return getDouble(min, max);
        }
        return value;
    }
    public double getDouble() {
        String input = getString();

        try {
            return Double.valueOf(input);
        } catch(NumberFormatException e) {
            System.out.println("Input must be a number.");
            return getDouble();
        }
    }

}
