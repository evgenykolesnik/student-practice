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
    System.out.println("Add test with values (" + a + ", " + b + ")");
    Assert.assertEquals(a + b, Calculator.add(a, b), String.format(
        "Incorrect value returned from add method with parameters ($d , $d)", a, b));
  }


  @Test(dataProvider = "dataProvider", groups = "mul")
  @Stories("Mul test")
  public void mulTest(int a, int b) {
    System.out.println("Mul test with values (" + a + ", " + b + ")");
    Assert.assertEquals(a * b, Calculator.mul(a, b), String.format(
        "Incorrect value returned from mul method with parameters ($d , $d)", a, b));
  }

  @Test(groups = {"mul", "add"})
  @Stories("Combine test")
  public void combine() {
    int a = 2;
    int b = 2;
    int c = 2;
    System.out.println("Combine test");
    Assert.assertEquals(a + b * c, Calculator.mul(Calculator.add(a, b), c),
        String.format(
            "Incorrect value returned from combine method with parameters (%d , %d, %d)", a, b, c));
  }
}
