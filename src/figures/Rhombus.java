package figures;

import static java.lang.Math.pow;

public class Rhombus extends Parallelogram {
    private double diag1;
    private double diag2;

    public Rhombus(float diag1, float diag2) {
        super(Math.sqrt(pow(diag1/2, 2)+pow(diag2/2, 2)), Math.sqrt(pow(diag1/2, 2)+pow(diag2/2, 2)));
        this.diag1 = diag1;
        this.diag2 = diag2;
    }

    @Override
    public double area() {
        return diag1*diag2*0.5;
    }

    @Override
    public String info() {
        return "Ромб с диагоналями " + diag1 + " и " + diag2;
    }
}
