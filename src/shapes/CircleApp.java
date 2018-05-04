/*
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */
package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        System.out.println("Enter the value of the radius: ");
        double radius = input.getDouble();
        Circle circle = new Circle(radius);
        System.out.printf("The area of the circle is %f%n", circle.getArea());
        System.out.printf("The circumference of the circle is %f%n", circle.getCircumference());
    }
}
