package shapes;

public class ShapesTest {
    public static void main(String[] args) {


        Measurable shape1 = new Rectangle(3, 5);

        Measurable shape2 = new Square(26);

        System.out.println("Rectangle with length of " + shape1.getLength() + " and width of " + shape1.getWidth() + " has area of " + shape1.getArea() + " and perimeter of " + shape1.getPerimeter());

        System.out.println("Square with sides of " + shape2.getLength() + " have an area of " + shape2.getArea() + " and perimeter of " + shape2.getPerimeter());

    }
}
