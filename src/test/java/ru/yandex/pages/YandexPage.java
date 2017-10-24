package ru.yandex.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


/**
 * Класс <class>YandexPage</class>
 *
 */
public class YandexPage {

    private WebDriver driver;

    //кнопка Найти
    @FindBy(xpath = ".//*[@id='filter']/tbody/tr[6]/td/input")
    private WebElement searchButton;

    public YandexPage(WebDriver driver){
        PageFactory.initElements(this.driver,this);
        this.driver = driver;
    }

   public boolean isSearchButtonEnabled(){
       return searchButton.isEnabled();
   }


}
