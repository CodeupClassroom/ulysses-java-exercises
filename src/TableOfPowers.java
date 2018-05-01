/*
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */

import java.util.Scanner;

public class TableOfPowers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // const number = prompt('Enter a number');
        System.out.print("What number would you like to go up to? ");
        int number = input.nextInt();

        System.out.println("Here is your table!");
        System.out.println("number | squared | cubed");
        System.out.println("------ | ------- | -----");

        for (int i = 1; i <= number; i++) {
//            System.out.println(i + "      | " + i * i + "       | " + i * i * i);
            // Refactoring -> recipes
            // extract variable
            // cmd + opt + v
            int squared = i * i;
            int cubed = i * i * i;
            System.out.printf("%d      | %d       | %d    |%n", i, squared, cubed);
        }
    }
}
