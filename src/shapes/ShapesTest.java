package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        System.out.println("Let's play with shapes!");

        Rectangle box1 = new Rectangle(4, 5);

        System.out.println(box1);

        // storing a Square object in a variable of Rectangle type
        // this is the polymorphism
        Rectangle box2 = new Square(5);

        System.out.println(box2);


    }
}
