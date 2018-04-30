/**
 * ClassName needs to match the filename
 */
public class HelloWorld {
    public static void main(String[] args) {
        // declaring
        int favoriteNumber;

        // initializing (assigning for the first time)
        favoriteNumber = 23;
        System.out.println(favoriteNumber);

        String myString = "Happy Un-birthday!";
        System.out.println(myString);

        // myString = 'c'; assigning a char to a string is a compilation error
        // myString = 5; can't assign a number to a String variable

        float myNumber;
        // cannot sout or operate on an uninitialized variable. Won't compile.
        // myNumber = 3.141; // cannot assign a double to a long w/o explicit casting
        // myNumber = (long) 3.141; will work b/c of the explicit casting.

        myNumber = 123L; // the L appended to the end is part of how we know this is a Long data type
        myNumber = 123; // works OK b/c 123 is a valid long.
        System.out.println(myNumber);

        float someNumber = 3.141F;

        int x = 5;
        System.out.println(++x);
        System.out.println(x);

        int y = 4;
        // y = y + 5;
        y += 5;
        System.out.println(y);

        int a = 3;
        int b = 4;
        // reassignment
        // y = y * x;
        b *= a;

        int c = 10;
        int d = 2;
        // x = x / y;
        // y = y - x;
        c /= d;
        d -= c;
    }
}
