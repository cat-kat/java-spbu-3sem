package figures;

public class Rectangle extends Parallelogram{
    public Rectangle(double width, double height) {
        super(width, height);
    }

    @Override
    public double area() {
        return side1*side2;
    }

    @Override
    public String info() {
        return "Прямоугольник с высотой " + side1 + " и шириной " + side2;
    }
}

