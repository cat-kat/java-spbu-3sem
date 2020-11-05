package figures;

import static java.lang.Math.pow;

public class Rhombus implements Figure {
    private float diag1;
    private float diag2;

    public Rhombus(float diag1, float diag2) {
        this.diag1 = diag1;
        this.diag2 = diag2;
    }

    @Override
    public double area() {
        return diag1*diag2*0.5;
    }

    @Override
    public double perimiter() {
        return 4*Math.sqrt(pow(diag1/2, 2)+pow(diag2/2, 2));
    }

    @Override
    public String info() {
        return "Ромб с диагоналями " + diag1 + " и " + diag2;
    }
}
