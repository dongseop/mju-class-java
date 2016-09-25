package kr.ac.mju.ict.shape;

/**
 * Created by dongseop on 2016-09-26.
 */
abstract class Shape implements Drawable {
    double x, y;

    public Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }
    abstract public double getArea();
    abstract public double getLength();
}
