package kr.ac.mju.java.ex001;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by dongseop on 2016-09-11.
 */
public class Ex001Test {
    @Test
    public void isLeapYear() throws Exception {
        assertTrue(Ex001.isLeapYear(2000));
        assertFalse(Ex001.isLeapYear(2001));
        assertFalse(Ex001.isLeapYear(2002));
        assertFalse(Ex001.isLeapYear(2003));
        assertTrue(Ex001.isLeapYear(2004));
        assertFalse(Ex001.isLeapYear(2005));
        assertFalse(Ex001.isLeapYear(2100));
    }
}