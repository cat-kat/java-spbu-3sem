package figures;

import static java.lang.Math.pow;

public class RightTriangle implements Figure {
    private double side1;
    private double side2;

    public RightTriangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double area() {
        return side1*side2*0.5;
    }

    @Override
    public double perimiter() {
        return side1 + side2 + Math.sqrt(pow(side1, 2)+pow(side2, 2));
    }

    @Override
    public String info() {
        return "Прямоугольный треугольник с катетами " + side1 + " и " + side2;
    }
}
