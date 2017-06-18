package com.griddynamics.qa;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;


public class CalculatorTest extends AbstractTest {
    @DataProvider
    public Object[][] DataProvider(Method m) {
        return new Object[][]{new Object[]
                {4, 5},
                {0, 0},
                {5, -5},
        };
    }

    @Test(dataProvider = "DataProvider", groups = "add")
    public void addTest(int a, int b) {
        System.out.println("Add test with values (" + a + ", " + b + ")");
        Assert.assertEquals(a + b, Calculator.add(a, b));
    }


    @Test(dataProvider = "DataProvider", groups = "mul")
    public void mulTest(int a, int b) {
        System.out.println("Mul test with values (" + a + ", " + b + ")");
        Assert.assertEquals(a * b, Calculator.mul(a, b));
    }

    @Test(groups = {"mul", "add"})
    public void combine() {
        System.out.println("Combine test");
        Assert.assertEquals(2 + 2 * 2, Calculator.mul(Calculator.add(2, 2), 2));
    }
}
