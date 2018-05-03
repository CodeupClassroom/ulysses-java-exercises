/*
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */

import java.util.Scanner;

public class DiceRoll {
    public static void main(String[] args) {
        int sides = askForNumberOfSides();
        do {
            rollDiceMessage();
            int dice1 = roll(sides);
            int dice2 = roll(sides);
            System.out.printf("Dice 1 is %d, Dice 2 is %d%n", dice1, dice2);
        } while (wantsToContinue());
    }
    public static int askForNumberOfSides() {
        Scanner input = new Scanner(System.in);
        System.out.println("How many sides?");
        return input.nextInt();
    }
    public static void rollDiceMessage() {
        System.out.println("Hit enter to roll the dices");
        Scanner input = new Scanner(System.in);
        input.nextLine();
    }
    public static int roll(int sides) {
        return (int) (Math.random() * sides) + 1;
    }
    public static boolean wantsToContinue() {
        System.out.println("Do you want to roll the dice again? y/n");
        Scanner input = new Scanner(System.in);
        String answer = input.nextLine();
        return "y".equalsIgnoreCase(answer) || "yes".equalsIgnoreCase(answer);
    }
}
