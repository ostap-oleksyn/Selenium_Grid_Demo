package tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.HomePage;

import static locators.Locators.FIRST_RESULT_LINK;


public class GoogleTest extends TestRunner {

    private static final String URL = "https://www.google.com/";

    @Test
    public void googleImagesTest() {
        driver.get(URL);
        HomePage homepage = new HomePage(driver);

        homepage.doSearchFor("funny picture");
        Assert.assertTrue(driver.findElement(FIRST_RESULT_LINK)
                        .getText()
                        .toLowerCase()
                        .contains("funny picture"),
                "Link does not contain 'funny picture text'");


    }
}