package kr.ac.mju.java.ex001;

import java.util.Scanner;

/**
 * Created by DONGSEOP KWON on 2016-09-11.
 */
public class Ex001 {
    private static final int[] DAYS_OF_MONTH = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static int getDaysOfMonth1(int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            return 31;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else if (month == 2) {
            return 28;
        }
        return 0;   // Error
    }

    public static int getDaysOfMonth2(int month) {
        int days;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 2:
                days = 28;
                break;
            default:
                days = 0;
        }
        return days;
    }

    public static int getDaysOfMonth3(int month) {
        try {
            return DAYS_OF_MONTH[month];
        } catch (ArrayIndexOutOfBoundsException ex) {
            return 0;
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) ||  (year % 100 != 0 && year % 4 == 0);
    }

    public static int getDaysOfMonthYear(int month, int year) {
        int days = getDaysOfMonth3(month);

        if (month == 2 && isLeapYear(year)) {
            days = 29;
        }
        return days;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int year, month;

        while (true) {
            System.out.println("Please input Year");
            year = sc.nextInt();
            System.out.println("Please input Month");
            month = sc.nextInt();
            System.out.println(getDaysOfMonthYear(month, year));
            if (getDaysOfMonth1(month) == 0 && getDaysOfMonth2(month) == 0) {
                break;
            }
        }
    }
}
