package kr.ac.mju.java.pos;

import java.util.Scanner;

/**
 * Created by dongseop on 2016-09-11.
 */
public class PosMain {
    private Item[] items;
    int numItems;
    public PosMain(int numItems) {
        this.numItems = numItems;
        items = new Item[numItems];
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many items do you have? ");
        int numItems = sc.nextInt();
        if (numItems < 1) {
            System.out.println("Needs the number of items");
            return;
        }

        PosMain pos = new PosMain(numItems);
        pos.getInputs();
        pos.print();
        return;
    }

    private void getInputs() {
        Scanner sc = new Scanner(System.in);
        String name;
        int price;
        int qty;
        for(int i = 0; i < numItems; i++) {
            System.out.printf("[%d] Name? ", i);
            name = sc.next();
            System.out.printf("[%d] Price? ", i);
            price = sc.nextInt();
            System.out.printf("[%d] Qty? ", i);
            qty = sc.nextInt();
            items[i] = new Item(name, price, qty);
        }
    }

    private void print() {
        int sum = 0;
        printHeader();
        for(Item item: items) {
            item.print();
            sum = sum + item.getTotalPrice();
        }
        printFooter(sum);
    }

    private void printLine() {
        System.out.println("--------------------------------------");
    }

    private void printHeader() {
        printLine();
        System.out.printf(" %d items\n", numItems);
        printLine();
    }

    private void printFooter(int sum) {
        printLine();
        System.out.printf(" Total: $ %d\n", sum);
        printLine();
    }
}
