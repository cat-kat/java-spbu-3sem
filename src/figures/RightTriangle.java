package figures;

import static java.lang.Math.pow;

public class RightTriangle extends Triangle {
    public RightTriangle(double side1, double side2) { super(side1, side2, Math.sqrt(pow(side1, 2) + pow(side2, 2)));
    }

    @Override
    public double area() {
        return side1*side2*0.5;
    }

    @Override
    public String info() {
        return "Прямоугольный треугольник с катетами " + side1 + " и " + side2;
    }
}
