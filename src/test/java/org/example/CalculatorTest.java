package org.example;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculatorTest extends CalculatorTestData {

    private Calculator calculator;
    //private final double floatingDelta = 0.0000000001;

    @BeforeClass
    void setupCalculator() {
        calculator = new Calculator();
    }


    @Test(testName = "intSumTest", dataProvider = "intSumData")
    void intSumTest(long a, long b, long expected) {
        long output = calculator.sum(a, b);
        Assert.assertEquals(output, expected);
    }

    @Test(testName = "floatSumTest", dataProvider = "floatSumData")
    void floatSumTest(double a, double b, double expected) {
        double output = calculator.sum(a, b);
        Assert.assertEquals(output, expected);
    }

    @Test(testName = "intSubTest", dataProvider = "intSubData")
    void intSubTest(long a, long b, long expected) {
        long output = calculator.sub(a, b);
        Assert.assertEquals(output, expected);
    }

    @Test(testName = "floatSubTest", dataProvider = "floatSubData")
    void floatSubTest(double a, double b, double expected) {
        double output = calculator.sub(a, b);
        Assert.assertEquals(output, expected);
    }

    @Test(testName = "intMultTest", dataProvider = "intMultData")
    void intMultTest(long a, long b, long expected) {
        long output = calculator.mult(a, b);
        Assert.assertEquals(output, expected);
    }

    @Test(testName = "floatMultTest", dataProvider = "floatMultData")
    void floatMultTest(double a, double b, double expected) {
        double output = calculator.mult(a, b);
        Assert.assertEquals(output, expected);
    }

    @Test(testName = "intDivTest", dataProvider = "intDivData")
    void intDivTest(long a, long b, long expected) {
        long output = calculator.div(a, b);
        Assert.assertEquals(output, expected);
    }

    @Test(testName = "intDivByZeroTest", expectedExceptions = ArithmeticException.class, timeOut = 1000L)
    void intDivByZeroTest() {
        calculator.div(1, 0);
    }

    @Test(testName = "floatDivTest", dataProvider = "floatDivData")
    void floatDivTest(double a, double b, double expected) {
        double output = calculator.div(a, b);
        Assert.assertEquals(output, expected);
    }

    @Test(testName = "floatDivByZeroTest", expectedExceptions = ArithmeticException.class, timeOut = 1000L)
    void floatDivByZeroTest() {
        calculator.div(1.4, 0);
    }

    @Test(testName = "powTest", dataProvider = "powData")
    void powTest(double a, double b, double expected) {
        double output = calculator.pow(a, b);
        Assert.assertEquals(output, expected);
    }

    @Test(testName = "sqrtTest", dataProvider = "sqrtData")
    void sqrtTest(double a, double expected) {
        double output = calculator.sqrt(a);
        Assert.assertEquals(output, expected);
    }

    @Test(testName = "sqrtNegTest")
    void sqrtNegTest() {
        Assert.assertTrue(Double.isNaN(calculator.sqrt(-1)));
    }

    @Test(testName = "sinTest", dataProvider = "sinData")
    void sinTest(double angle, double expected) {
        double output = calculator.sin(angle);
        Assert.assertEquals(output, expected);
    }

    @Test(testName = "cosTest", dataProvider = "cosData")
    void cosTest(double angle, double expected) {
        double output = calculator.cos(angle);
        Assert.assertEquals(output, expected);
    }

    @Test(testName = "tgTest", dataProvider = "tgData")
    void tgTest(double angle, double expected) {
        double output = calculator.tg(angle);
        Assert.assertEquals(output, expected);
    }

    @Test(testName = "tgOfPIbyTwoTest")
    void tgOfPIbyTwoTest()
    {
        Assert.assertEquals(calculator.tg(Math.PI / 2), Double.POSITIVE_INFINITY);
    }

    @Test(testName = "ctgTest", dataProvider = "ctgData")
    void ctgTest(double angle, double expected) {
        double output = calculator.tg(angle);
        Assert.assertEquals(output, expected);
    }

    @Test(testName = "ctgOfZeroTest")
    void ctgOfZeroTest()
    {
        Assert.assertEquals(calculator.ctg(0.0), Double.POSITIVE_INFINITY);
    }

    @Test(testName = "isPositiveTest", dataProvider = "isPositiveData")
    void isPositiveTest(long val, boolean expected)
    {
        boolean output = calculator.isPositive(val);
        Assert.assertEquals(output, expected);;
    }

    @Test(testName = "isNegativeTest", dataProvider = "isNegativeData")
    void isNegativeTest(long val, boolean expected)
    {
        boolean output = calculator.isNegative(val);
        Assert.assertEquals(output, expected);;
    }


}
