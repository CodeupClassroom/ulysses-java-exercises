import org.jetbrains.annotations.Contract;

import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {

        System.out.println("Let's write and use methods!");

        System.out.println("2 plus 3 is " + add(2.23, 3.62));
        System.out.println("2 minus 3 is " + subtract(2, 3));
        System.out.println("2 times 3 is " + multiply(2, 3));
        System.out.println("2 divided by 3 is " + divide(2, 3));
        System.out.println("The remainder of integer division of 2 by 3 is " + modulo(2, 3));

        int number = getInt(1, 10);

        showFactorialOutput(number);




    }


    @Contract(pure = true)
    public static int add(int a, int b) {
        return a + b;
    }

    @Contract(pure = true)
    public static double add(double a, double b) {
        return a + b;
    }

    public static long add(long a, long b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        return (double) a / b;
    }

    public static int modulo(int number, int divisor) {
        return number % divisor;
    }

    public static int getInt() {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        return scan.nextInt();
    }

    public static int getInt(int min, int max) {
        System.out.println("Please input an integer between " + min + " and" + max + ": ");
        int number = getInt();

        // sad path -> the number provided is outside of the range of provided min/max values
        if(number < min || number > max) {
            return getInt(min, max);
        }

        // happy path
        return number;
    }

    // pure function to get the factorial
    public static long factorial(int number) {
        long total = 1;
        for(int i = number; i >= 1; i--) {
            total *= i;
        }

        return total;
    }

    // output should look like this: 4! = 1 x 2 x 3 x 4   = 24
    public static void showFactorialOutput(int number) {
        String output = number + "! = ";

        for(int i = 1; i <= number; i++) {
            output += i + " x ";
        }

        if(output.endsWith("x ")) {
            output = output.substring(0, output.length() - 2);
        }

        output += " = " + factorial(number);

        System.out.println(output);

    }

    // add a dicerolling application that adds two dice of n sides
    // add a rollDice() method that takes in the number of sidel
}
