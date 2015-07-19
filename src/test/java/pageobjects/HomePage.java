package pageobjects;

import locators.Locators;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public final class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public final SearchResultPage doSearchFor(String searchTerm) {
        driver.findElement(Locators.SEARCH_FIELD).clear();
        driver.findElement(Locators.SEARCH_FIELD).sendKeys(searchTerm);
        driver.findElement(Locators.SEARCH_FIELD).sendKeys(Keys.ENTER);
        return new SearchResultPage(driver);
    }
}
