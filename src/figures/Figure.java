package figures;

import static java.lang.Math.pow;

public interface Figure {

    double area();
    double perimiter();

    static double capacity(Figure f) { return f.area()/pow(f.perimiter(), 2); }

    default double capacity() {
        return area()/pow(perimiter(),2);
    }

    String info();
}
