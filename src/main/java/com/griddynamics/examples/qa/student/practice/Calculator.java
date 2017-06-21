package com.griddynamics.examples.qa.student.practice;

class Calculator {

  private Calculator() throws Exception {
    throw new Exception("Private constructor for preventing instance creation");
  }

  static int add(int a, int b) {
    return a + b;
  }

  static int mul(int a, int b) {
    return a * b;
  }
}
