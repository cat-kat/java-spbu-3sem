package figures;

public abstract class Parallelepiped implements Figure{
    protected double side1;
    protected double side2;

    public Parallelepiped(double side1, double side2) {
        this.side2 = side2;
        this.side1 = side1;
    }

    public abstract double area();

    public double perimiter() { return 2*side1 + 2*side2; }
}
