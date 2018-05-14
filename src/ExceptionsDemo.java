import util.Input;

import java.util.InputMismatchException;

public class ExceptionsDemo {

    public static void main(String[] args) {
        int number = getNumberAtIndex();

        System.out.println("you got the number of :  " + number);
    }

    protected static int getNumberAtIndex() {
        Input input = new Input();

        int[] numbers = {5, 6, 7, 8};

        System.out.println("Please input the index of the element you want to access...");
        int index = -1;

        try {

            index = input.getInt();
            return numbers[index];

        } catch (InputMismatchException e) {
            System.out.println("Be sure to put in an integer");
            System.out.println(e);
            return getNumberAtIndex();

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("There is no element at the provided index. The array only has " + numbers.length + " number of elements.");
            return getNumberAtIndex();

        } catch(Exception e) {
            System.out.println("There's any other exception");
            System.out.println(e);
        } finally {
            System.out.println("This runs whether there as an exception or not...");
        }

        return index;
    }

}
