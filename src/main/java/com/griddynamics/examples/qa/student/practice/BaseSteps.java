package com.griddynamics.examples.qa.student.practice;

import java.util.logging.Logger;
import ru.yandex.qatools.allure.annotations.Attachment;
import ru.yandex.qatools.allure.annotations.Step;

public class BaseSteps {
  private static final Logger log = Logger.getLogger(BaseSteps.class.getName());

  @Step("Open connections")
  public void openConnections() {
    log.info("Open connections");
  }

  @Step("Close connections")
  public void closeConnections() {
    log.info("Close connections");
  }

  @Step("Load parameters")
  public void loadParameters() {
    log.info("Load parameters");
  }

  @Step("Perform multiply({0}, {1})")
  @Attachment
  public int multiply(int a, int b) {
    return a * b;
  }

  @Step("Perform addition({0}, {1})")
  @Attachment
  public int addition(int a, int b) {
    return a + b;
  }

  @Step("Perform combine({0}, {1}, {2})")
  @Attachment()
  public int combine(int a, int b, int c) {
    return a + b * c;
  }

  @Step("Logging")
  public void logging(String pattern, Object... args) {
    log.info(String.format(pattern, args));
    ;
  }

}
