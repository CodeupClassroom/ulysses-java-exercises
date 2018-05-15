import util.Input;

import java.util.Scanner;

public class ExceptionsDemo {

    public static void main(String[] args) {

        try {
            int number = getNumberAtIndex();
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

    protected static void getFavoriteFood() throws Exception {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.println("What's your favorite food? ");
        String food = scan.next();
        if(!food.equalsIgnoreCase("pizza")) {
            throw new Exception("The application breaks unless your favorite food is pizza.");
        }

        System.out.println("Good, yay! Welcome to the pizza club.");

    }


    protected static int getNumberAtIndex() throws ArrayIndexOutOfBoundsException {
        Input input = new Input();

        int[] numbers = {5, 6, 7, 8};

        System.out.println("Please input the index of the element you want to access...");

        int index = input.getInt();

        if(index < 0 || index >= numbers.length) {
            throw new ArrayIndexOutOfBoundsException("No element at that index, yo!");
        }
        return numbers[index];

    }

}
