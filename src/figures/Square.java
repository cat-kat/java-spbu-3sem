package figures;

import static java.lang.Math.pow;

public class Square extends Parallelepiped {

    public Square(double side) {
        super(side, side);
    }

    @Override
    public double area() {
        return pow(side1, 2);
    }

    @Override
    public String info() {
        return "Квадрат со стороной " + side1;
    }
}
