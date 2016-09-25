package kr.ac.mju.ict.shape;

public class Bear implements Drawable {
    Composite composite = new Composite();

    Bear(double x, double y, double radius) {
        composite.add(new Text("Bear"));
        composite.add(new Rectangle(x - radius, y - radius, 2.0 * radius, 2.0 * radius));
        composite.add(new Circle(x - radius, y - radius, radius / 2.0));
        composite.add(new Circle(x + radius, y - radius, radius / 2.0));
    }

    @Override
    public void draw() {
        composite.draw();
    }
}
