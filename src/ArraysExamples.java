/*
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */

import shapes.Circle;

import java.util.Arrays;

public class ArraysExamples {
    public static void main(String[] args) {
        double[] numbers; // variable declaration
        numbers = new double[7]; // instantiation
        boolean[] booleans = new boolean[5];
        boolean[] booleans1 = new boolean[5];
        String[] strings = new String[10];
        Bob[] bobs = new Bob[10];

        System.out.println(Arrays.toString(strings));
        Arrays.fill(strings, "default");
        System.out.println(Arrays.toString(strings));

        System.out.println(booleans == booleans1);
        System.out.println(Arrays.equals(booleans, booleans1));

        // by enumeration
        String beatles[] = {"John", "Paul", "Ringo", "George"};
        System.out.println(Arrays.toString(beatles));
        Arrays.sort(beatles); // changes the original array, elements are re-indexed
        System.out.println(Arrays.toString(beatles));
        int found = Arrays.binarySearch(beatles, "George");
        System.out.println("John is in the index " + found);

        String moreBeatles[] = Arrays.copyOf(beatles, beatles.length + 1);
        System.out.println(Arrays.toString(moreBeatles));

        String lessBeatles[] = Arrays.copyOf(beatles, beatles.length - 1);
        System.out.println(Arrays.toString(lessBeatles));

        boolean[] withValues = {true, false, true, false};
        Circle circles[] = {new Circle(4), new Circle(20), new Circle(4.5)};

        System.out.println(beatles[2]);
        System.out.println(Math.round(circles[1].getArea()));
        System.out.println((int) circles[2].getCircumference());

        System.out.println(circles.length);

        for (int i = 0; i < beatles.length; i++) {
            System.out.print(beatles[i] + ", ");
        }

        // enhanced for loop
        for (String beatle : beatles) {
            System.out.println(beatle);
        }

        for (int i = 0; i < circles.length; i++) {
            System.out.println(circles[i].getArea());
            System.out.println(circles[i].getCircumference());
        }

        for (Circle circle : circles) {
            System.out.printf("The area of the circle with radius %.2f is %.2f%n", circle.getRadius(), circle.getArea());
            System.out.println(circle.getCircumference());
        }

        numbers[0] = 6; // in Java arrays do not have methods

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(booleans));
        System.out.println(Arrays.toString(strings));
        System.out.println(Arrays.toString(bobs));
        System.out.println(Arrays.toString(beatles));
        System.out.println(Arrays.toString(withValues));
        System.out.println(Arrays.toString(circles));

        //numbers[7] = 8; // error!
    }
}
