package com.griddynamics.examples.qa.student.practice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

  protected BaseSteps baseTest = new BaseSteps();

  @BeforeSuite(alwaysRun = true)
  public void beforeSuite() {
    baseTest.loadParameters();
  }

  @BeforeMethod(alwaysRun = true)
  public void beforeTest() {
    baseTest.openConnections();
  }

  @AfterMethod(alwaysRun = true)
  public void afterTest() {
    baseTest.closeConnections();
  }
}
