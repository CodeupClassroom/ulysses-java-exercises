/*
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */
package shapes;

public class Circle {
    private static int circleCount = 0;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        circleCount++;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getCircumference() {
        return Math.PI * 2 * radius;
    }

    public static int getCircleCount() {
        return circleCount;
    }
}
