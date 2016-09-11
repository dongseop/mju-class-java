package kr.ac.mju.java.shop;

/**
 * Created by dongseop on 2016-09-11.
 */
public class Product {
    private String name;
    private double price;
    private int qty;

    public Product(String name, double price, int qty) {
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    public Product(String name, double price) {
        this(name, price, 0);
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void addStock(int qty) {
        this.qty += qty;
    }

    public void removeStock(int qty) {
        this.qty -= qty;
    }
}
