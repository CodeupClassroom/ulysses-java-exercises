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
        return null;
    }

    boolean yesNo() {
        return true;
    }
    int getInt(int min, int max) {
        return 0;
    }
    int getInt() {
        return 0;
    }
    double getDouble(double min, double max) {
        return 0;
    }
    double getDouble() {
        return 0;
    }
}
