package figures;

public abstract class Triangle implements Figure {
    protected double side1;
    protected double side2;
    protected double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side2 = side2;
        this.side1 = side1;
        this.side3 = side3;
    }
    @Override
    public double perimiter() { return side1 + side2 + side3; }

    @Override
    public double area() {
        double p = perimiter() / 2;
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));}

    @Override
    public String info() {
        return "Треугольник со сторонами: " + side1 + ", " + side2 + " и " + side3;
    }
}
