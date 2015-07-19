package tests;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class TestRunner {

    protected WebDriver driver;

    protected TestRunner() {
    }

    @BeforeClass
    public void setUp() throws MalformedURLException {


        /*DesiredCapabilities capabilities = new DesiredCapabilities();

        Platform platform =
        capabilities.setPlatform();
        capabilities.setBrowserName();
        capabilities.setVersion();

        driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);*/


        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
