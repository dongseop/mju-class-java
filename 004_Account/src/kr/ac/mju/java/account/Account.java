package kr.ac.mju.java.account;

/**
 * Created by dongseop on 2016-09-18.
 */
public class Account {
    private double balance;
    private String name;

    private static double rate;
    public static double getRate() {
        return rate;
    }
    public static void setRate(double rate) {
        Account.rate = rate;
    }

    public Account(double balance, String name) {
        this.balance = balance;
        this.name = name;
    }

    public Account(double balance) {

        this(balance, "No-name");
    }

    public Account(String name) {

        this(0, name);
    }

    public Account() {
        this(0, "No-name");
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print() {
        System.out.printf("%s : %5.1f\n", name, balance);
    }
}
