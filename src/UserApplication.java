import java.util.Scanner;

public class UserApplication {
    public static void main(String[] args) {
        System.out.println("Welcome to the HR application");
        System.out.println("Currently, we have " + User.getNumberOfUsers() + " of users.");

        User luis = new User("Luis@Codeup.com", "montealegreluis", "password123!", true);

        System.out.println("After creating Luis, we have: " + User.getNumberOfUsers());

        User guest = new User("bob@bob.bob");

        System.out.println("After creating two users, we should have " + User.getNumberOfUsers());

    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static double add(double a, double b) {
        return a + b;
    }
}
