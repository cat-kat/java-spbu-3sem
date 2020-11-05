package figures;

public class ExperimentsWithFigures {
    public static void main(String[] args) {
        Circle a = new Circle(5);
        EquilateralTraingle b = new EquilateralTraingle(4);
        Rectangle c = new Rectangle(4, 6);
        Rhombus d = new Rhombus(16, 9);
        RightTriangle e = new RightTriangle(4, 5);
        Square f = new Square(5);
        Figure [] figures = {a, b, c, d, e, f};
        for (Figure i: figures) {
            System.out.println(i.info());
            System.out.println(i.area());
            System.out.println(i.perimiter());
            System.out.println("*---------------------------------*");
        }

    }
}
