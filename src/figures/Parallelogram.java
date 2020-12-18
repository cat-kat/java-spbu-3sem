package figures;

public abstract class Parallelogram implements Figure{
    protected double side1;
    protected double side2;

    public Parallelogram(double side1, double side2) {
        this.side2 = side2;
        this.side1 = side1;
    }

    public double perimiter() { return 2*side1 + 2*side2; }
}
