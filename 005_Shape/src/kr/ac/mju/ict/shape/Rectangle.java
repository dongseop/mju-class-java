package kr.ac.mju.ict.shape;

public class Rectangle extends Shape {
    double width, height;

    public Rectangle(double x, double y, double width, double height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getLength() {
        return 2 * (width + height);
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.printf("Rectagle (%.1f, %.1f)-(%.1f, %.1f)\n", x, y, x + width, y + height);
    }
}
