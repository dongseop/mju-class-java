package kr.ac.mju.ict.shape;


public class Circle extends Shape {
    double radius;

    public Circle(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getLength() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void draw() {
        System.out.printf("Circle center(%.1f, %.1f)-radius(%.1f)\n", x, y, radius);
    }
}
