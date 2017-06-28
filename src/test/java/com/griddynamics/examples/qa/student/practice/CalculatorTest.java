package com.griddynamics.examples.qa.student.practice;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;


@Features("Calculator testing")
public class CalculatorTest extends BaseTest {

  @DataProvider
  public Object[][] dataProvider() {
    return new Object[][]{new Object[]
        {4, 5},
        {0, 0},
        {5, -5},
    };
  }

  @Test(dataProvider = "dataProvider", groups = "add")
  @Stories("Add test")
  public void addTest(int a, int b) {
    baseTest.logging(
        "Add test with parameters (%d , %d)", a, b);
    Assert.assertEquals(baseTest.addition(a, b), Calculator.add(a, b), String.format(
        "Incorrect value returned from add method with parameters (%d , %d)", a, b));
  }


  @Test(dataProvider = "dataProvider", groups = "mul")
  @Stories("Mul test")
  public void mulTest(int a, int b) {
    baseTest.logging(
        "Mul test with parameters (%d , %d)", a, b);
    Assert.assertEquals(baseTest.multiply(a, b), Calculator.mul(a, b), String.format(
        "Incorrect value returned from mul method with parameters (%d , %d)", a, b));
  }

  @Test(groups = {"mul", "add"})
  @Stories("Combine test")
  public void combineTest() {
    int a = 2;
    int b = 2;
    int c = 2;
    baseTest.logging(
        "Combine test with parameters (%d , %d, %d)", a, b, c);
    Assert.assertEquals(baseTest.combine(a, b, c), Calculator.combine(a, b, c),
        String.format(
            "Incorrect value returned from combine method with parameters (%d , %d, %d)", a, b, c));
  }
}
