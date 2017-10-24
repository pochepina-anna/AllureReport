package ru.yandex;

import ru.yandex.helpers.DriverSetUp;
import ru.yandex.pages.YandexPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Класс <class>AllureTest</class>
 *
 */

public class AllureTest extends DriverSetUp{

    private static final String URL = "https://yandex.ru/";
    private YandexPage yandexPage = new YandexPage(driver);


    @Test
    public void searchButtonEnabled()throws Exception {
        openYandexMainPage(driver, URL);
        Assert.assertTrue(yandexPage.isSearchButtonEnabled());
    }

    private void openYandexMainPage(WebDriver driver, String url) {
        driver.get(url);
    }
}
