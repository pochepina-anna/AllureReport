package ru.yandex.helpers;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import static ru.yandex.helpers.Utils.makeScreenshot;

/**
 * Класс <class>AllureTestListener</class>
 *
 */
public class AllureTestListener extends TestListenerAdapter {


    @Override
    public void onTestStart(ITestResult result) {

    }

    @Override
    public void onTestSuccess(ITestResult result) {

    }

    @Override
    public void onTestFailure(ITestResult result) {
        makeScreenshot();
    }

}
