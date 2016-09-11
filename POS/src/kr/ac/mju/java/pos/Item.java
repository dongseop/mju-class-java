package kr.ac.mju.java.pos;

/**
 * Created by dongseop on 2016-09-11.
 */
public class Item {
    private String name;
    private int price;
    private int qty;

    public Item(String name, int price, int qty) {
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    public void print() {
        System.out.printf("  - %s\t$ %d\t*\t%d\t=\t$ %d\n", name, price, qty, getTotalPrice());
    }

    public int getTotalPrice() {
        return price * qty;
    }
}
