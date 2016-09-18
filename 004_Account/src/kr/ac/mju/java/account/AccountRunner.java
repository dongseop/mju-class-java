package kr.ac.mju.java.account;

/**
 * Created by dongseop on 2016-09-18.
 */
public class AccountRunner {
    public static void main(String args[]) {
        Account a = new Account();
        Account b = new Account(1000, "AccountB");


        System.out.println(a.getBalance());
        System.out.println(a.getName());
        System.out.println(b.getBalance());
        System.out.println(b.getName());

        a.print();
        b.print();
    }
}
