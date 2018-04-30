public class CastingDemo {
    public static void main(String[] args) {

        // Explicit casting. We have to explicitly cast if we're losing data
        double pi = 3.1415926;

        // treat the variable on the right of (int) as an int
        int almostPi = (int) pi;
        System.out.println(almostPi);

        // implicit casting is also called widening conversion
        short favoriteNumber = 23;

        double someNumber = favoriteNumber;
        System.out.println(someNumber);

    }
}
