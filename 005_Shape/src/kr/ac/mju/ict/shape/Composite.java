package kr.ac.mju.ict.shape;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Drawable {
    List<Drawable> list = new ArrayList<Drawable>();

    public void add(Drawable item) {
        list.add(item);
    }

    public void clear() {
        list.clear();
    }

    @Override
    public void draw() {
        for(Drawable item: list) {
            item.draw();
        }
    }
}
