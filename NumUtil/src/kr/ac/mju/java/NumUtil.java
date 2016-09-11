package kr.ac.mju.java;

/**
 * Created by dongseop on 2016-09-11.
 */
public class NumUtil {
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for(int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isOdd(int num) {
        return !isEven(num);
    }
}
