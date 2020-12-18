package figures;

import static java.lang.Math.pow;

public class Square extends Rectangle {

    public Square(double side) {
        super(side, side);
    }

    @Override
    public String info() {
        return "Квадрат со стороной " + side1;
    }
}
