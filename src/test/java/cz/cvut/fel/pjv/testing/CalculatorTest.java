package cz.cvut.fel.pjv.testing;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAdd() {
        System.out.println("Adding...");
        int a = 10;
        int b = 100;
        Calculator instance = new Calculator();
        int expResult = 110;
        int result = instance.add(a, b);
        Assert.assertEquals("Adding error", expResult, result);
        System.out.println("Adding was successful!\n");
    }

    @Test
    public void testSubtract() {
        System.out.println("Subtracting...");
        int a = 53;
        int b = 3;
        Calculator instance = new Calculator();
        int expResult = 50;
        int result = instance.subtract(a, b);
        Assert.assertEquals("Subtracting error", expResult, result);
        System.out.println("Subtracting was successful!\n");
    }

    @Test
    public void testMultiply() {
        System.out.println("Multiplying...");
        int a = 8;
        int b = 7;
        Calculator instance = new Calculator();
        int expResult = 56;
        int result = instance.multiply(a, b);
        Assert.assertEquals("Multiplying error", expResult, result);
        System.out.println("Multiplying was successful!\n");
    }

    @Test
    public void testDivide() {
        System.out.println("Dividing...");
        int a = 12;
        int b = 3;
        Calculator instance = new Calculator();
        int expResult = 4;
        int result = instance.divide(a, b);
        Assert.assertEquals("Dividing error", expResult, result);
        System.out.println("Division was successful!\n");
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideExceptionZero() throws ArithmeticException {
        System.out.println("Checking zero dividing exception...");
        int a = 5;
        int b = 0;
        Calculator instance = new Calculator();
        int expResult = 0;
        int result = instance.divide(a, b);
        Assert.assertEquals("Dividing error", expResult, result);
        System.out.println("Exception test was successful!\n");
    }
}