package shapes;

public class Rectangle {
    protected double length;
    protected double width;
    protected String type;

    public Rectangle(double length, double width) {
        // shadowing means assigning a named property on the object with an argument coming in from a method
        this.length = length;
        this.width = width;
        type = "rectangle";
    }

    public String getType() {
        return type;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * length + 2 * width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public String toString() {
        return "A " + getType() + " with length of " + getLength() + " and width of " + getWidth() +
                " has an area of: " + getArea() + " and a perimeter of " + getPerimeter();
    }
}
