package figures;

public interface Figure {

    double area();
    double perimiter();

 /*   static double capacity(Figure f) {
        return f.area()/f.perimiter();
    } */

    default double capacity() {
        return area()/perimiter();
    }
    String info();
}
