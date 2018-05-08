package shapes;

public class Square extends Rectangle {
    public Square(double side) {
        super(side, side); //  calling the parent constructor and passing side's value to both the length and the width
        type = "square";
    }


}
