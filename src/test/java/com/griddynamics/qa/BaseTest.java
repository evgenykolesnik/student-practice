package com.griddynamics.qa;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import ru.yandex.qatools.allure.annotations.Step;

public class BaseTest {

    @BeforeSuite(alwaysRun = true)
    @Step("Before suite")
    public void beforeSuite() {
        System.out.println("Before suite");
    }

    @AfterSuite(alwaysRun = true)
    @Step("After suite")
    public void afterSuite() {
        System.out.println("After suite");
    }

    @BeforeMethod(alwaysRun = true)
    @Step("Before method")
    public void beforeMethod() {
        System.out.println("Before method");
    }

    @AfterMethod(alwaysRun = true)
    @Step("After method")
    public void afterMethod() {
        System.out.println("After method");
    }
}
