import java.util.Scanner;

public class StringDemo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = "Jane";
        String inputName = scan.next();

        if(name == inputName) {
            System.out.println("The strings are the same object");
        }

        if(name.equals(inputName)) {
            System.out.println("The sequence of characters in each string is the same.");
        }

    }
}
