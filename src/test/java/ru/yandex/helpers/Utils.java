package ru.yandex.helpers;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import ru.yandex.qatools.allure.annotations.Attachment;

/**
 * Класс <class>Utils</class>
 */

public final class Utils extends DriverSetUp{
    private Utils() {}

    @Attachment(value = "{0}", type = "image/png")
    public static byte[] makeScreenshot() {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }
}
