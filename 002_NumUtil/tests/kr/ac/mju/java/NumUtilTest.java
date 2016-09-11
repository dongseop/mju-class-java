package kr.ac.mju.java;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by dongseop on 2016-09-11.
 */
public class NumUtilTest {
    @Test
    public void testEven() throws Exception {
        assertFalse(NumUtil.isEven(-1));
        assertTrue(NumUtil.isEven(0));
        assertFalse(NumUtil.isEven(1));
        assertTrue(NumUtil.isEven(2));
        assertFalse(NumUtil.isEven(3));
        assertTrue(NumUtil.isEven(4));
    }

    @Test
    public void testOdd() throws Exception {
        assertTrue(NumUtil.isOdd(-1));
        assertFalse(NumUtil.isOdd(0));
        assertTrue(NumUtil.isOdd(1));
        assertFalse(NumUtil.isOdd(2));
        assertTrue(NumUtil.isOdd(3));
        assertFalse(NumUtil.isOdd(4));
    }

    @Test
    public void testPrime() {
        assertFalse(NumUtil.isPrime(-2));
        assertFalse(NumUtil.isPrime(0));
        assertFalse(NumUtil.isPrime(1));
        assertTrue(NumUtil.isPrime(2));
        assertTrue(NumUtil.isPrime(3));
        assertFalse(NumUtil.isPrime(4));
        assertTrue(NumUtil.isPrime(5));
        assertFalse(NumUtil.isPrime(6));
        assertFalse(NumUtil.isPrime(100));
        assertFalse(NumUtil.isPrime(100));
    }
}