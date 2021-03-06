import java.util.Scanner;

public class MethodDemo {
    // visibility (static) returnType methodName(paramType1 param1, paramType2 param2)
    public static void main(String[] args) {
        greeting();
        sayHello("Luis");
        System.out.println(power(2, 10));
        System.out.println(power(3));

        int number;

        do {
            number = favoriteNumber();
            System.out.println("You said that " + number + " is your favorite number.");

        } while(wantsToContinue());
    }

    public static String sayGoodBye(String nickname) { // family/friends
        return "Goodbye " + nickname;
    }

    public static String sayGoodBye() { // people we just met
        return "Goodbye!";
    }

    public static int power(int number) {
//        return number;
        return power(number, 1);
    }

    public static int power(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void greeting() {
        System.out.println("Hi, nice to meet you.");
    }

    public static boolean isPizza(String someString) {
        return someString.equalsIgnoreCase("pizza");
    }

    // method overloading
    public static void sayHello() {
        System.out.println("Hello, World!");
    }

    public static void sayHello(String name) {
        System.out.println("Hello, " + name);
    }

    public static void sayHello(String firstName, String lastName) {
        String fullName = fullName(firstName, lastName);
        System.out.println("Greetings, " + fullName);
    }

    public static String fullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    public static double quotient(int numerator, int divisor) {
        return numerator / divisor;
    }

    public static int favoriteNumber() {
        System.out.print("What's your favorite number? ");
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        int num = input.nextInt();
        return num;
    }

    public static boolean wantsToContinue() {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Press y or yes to continue");
        String userChoice = input.next();
        boolean result = userChoice.equalsIgnoreCase("y") || userChoice.equalsIgnoreCase("yes");
        return result;
    }


}
