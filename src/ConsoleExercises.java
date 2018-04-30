import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter an integer: ");
        int userInt = scan.nextInt();

        System.out.println("Please enter 3 words: ");
        String first = scan.next();
        String second = scan.next();
        String third = scan.next();

        System.out.println(first + " " + second + " " + third);

        scan.nextLine(); // grabs the last \n character and we can ignore it.

        System.out.println("Input a sentence");
        String sentence = scan.nextLine();
        System.out.println(sentence);

        System.out.println(); // give an extra space
        System.out.print("Input the length: ");
        String lengthString = scan.next();
        double length = Double.parseDouble(lengthString);
        System.out.println("length is " + length);

        System.out.print("Input the width: ");
        String widthString = scan.next();
        double width = Double.parseDouble(widthString);
        System.out.println("Width is " + width);

        System.out.print("Input the height of the room: ");
        String heightString = scan.next();
        double height = Double.parseDouble(heightString);

        double area = width * length;
        System.out.println("Area of the room is: " + area);

        double perimeter = 2 * width + 2 * length;
        System.out.println("Perimeter is " + perimeter);

        double volume = width * length * height;
        System.out.println("Volume is " + volume);
    }
}
