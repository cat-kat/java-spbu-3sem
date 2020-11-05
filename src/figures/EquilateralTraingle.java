package figures;
import static java.lang.Math.pow;

public class EquilateralTraingle implements Figure {
    private double side;

    public EquilateralTraingle(float side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side*side*Math.sqrt(3)*0.25;
    }

    @Override
    public double perimiter() {
        return side*3;
    }

    @Override
    public String info() {
        return "Равнобедренный треугольник со стороной" + side;
    }
}
