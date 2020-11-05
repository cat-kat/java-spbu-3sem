package figures;

import static java.lang.Math.pow;

public class Square extends Rectangle {

    public Square(float side) {
        super(side, side);
    }

    @Override
    public double area() {
        return pow(width, 2);
    }

    @Override
    public double perimiter() {
        return 4*width;
    }

    @Override
    public String info() {
        return "Квадрат со стороной " + width;
    }
}
