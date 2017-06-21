package com.griddynamics.examples.qa.student.practice;

import ru.yandex.qatools.allure.annotations.Step;

public class BaseSteps {

  @Step("Open connections")
  public void openConnections() {
    System.out.println("Open connections");
  }

  @Step("Close connections")
  public void closeConnections() {
    System.out.println("Close connections");
  }

  @Step("Load parameters")
  public void loadParameters() {
    System.out.println("Load parameters");
  }

  @Step("Perform multiply({0}, {1})")
  public int multiply(int a, int b) {
    return a * b;
  }

  @Step("Perform addition({0}, {1})")
  public int addition(int a, int b) {
    return a + b;
  }

  @Step("Perform combine({0}, {1}, {2})")
  public int combine(int a, int b, int c) {
    return a + b * c;
  }

  @Step("{0}")
  public void logging(String s) {
    System.out.println(s);
  }

}
