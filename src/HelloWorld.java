/**
 * ClassName needs to match the filename
 */
public class HelloWorld {
    public static void main(String[] args) {
        // variable declaration
        String message;

        // variable assignment, first time assignment is called initialization
        message = "Hello, World!";
        System.out.println(message);

        // declare/initialize on one line
        int favoriteNumber = 23;
        System.out.println("My favorite number is " + favoriteNumber);

        // reassigning the variable
        favoriteNumber = 5;
        System.out.println("My favorite number changed and it's now " + favoriteNumber);


        int age = 19;

        // declare the variable
        boolean canRentCar;

        // conditional assignment
        if(age > 25) {
            canRentCar = true;
        } else {
            canRentCar = false;
        }

        final String MY_NAME;
        MY_NAME = "Ryan";

        System.out.println(MY_NAME);



    }
}
