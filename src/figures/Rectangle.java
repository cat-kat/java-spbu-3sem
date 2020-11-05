package figures;

public class Rectangle implements Figure {
    protected float width;
    protected  float height;

    public Rectangle(float width, float height) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double area() {
        return height*width;
    }

    @Override
    public double perimiter() {
        return 2*width+2*height;
    }

    @Override
    public String info() {
        return "Прямоугольник с высотой " + height + " и шириной " + width;
    }
}

