package figures;

import static java.lang.Math.pow;

public class Circle implements Figure {
    private double radius;

    public Circle (float radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI*pow(radius, 2);
    }

    @Override
    public double perimiter() {
        return 2*Math.PI*radius;
    }

    @Override
    public String info() {
        return "Круг с радиусом " + radius;
    }
}