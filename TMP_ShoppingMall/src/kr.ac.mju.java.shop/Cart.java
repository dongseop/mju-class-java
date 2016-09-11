package kr.ac.mju.java.shop;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dongseop on 2016-09-11.
 */
public class Cart {
    class Item {
        Product product;
        int qty;

        public Item(Product product, int qty) {
            this.product = product;
            this.qty = qty;
        }

        public String getName() {
            return product.getName();
        }

        public int getQty() {
            return qty;
        }

        public double getTotalPrice() {
            return getQty() * product.getPrice();
        }

        public void print() {
            System.out.printf("%s * %d = %f\n", getName(), getQty(), getTotalPrice());
        }
    }

    List<Item> items = new ArrayList<>();

    public void clear() {
        items.clear();
    }

    public void add(Product product, int qty) {
        items.add(new Item(product, qty));
    }

    public void print() {
        for(Item item: items) {
            item.print();
        }
    }
}
