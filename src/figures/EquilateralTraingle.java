package figures;
import static java.lang.Math.pow;

public class EquilateralTraingle extends Triangle {

    public EquilateralTraingle(float side) { super(side, side, side); }

    @Override
    public double area() {
        return side1*side1*Math.sqrt(3)*0.25;
    }

    @Override
    public String info() {
        return "Равнобедренный треугольник со стороной " + side1;
    }

    @Override
    public double capacity() { return 1 / (4 * 3 * Math.sqrt(3)); }
}
