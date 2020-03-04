package com.garantibbva.base;

import com.garantibbva.page.LoginPage;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {
    static WebDriver driver = null;  //bunun getter setter'ını oluştur. Static yap. Generate ile oluşturcan

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "properties/driver/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        ///Burası önemli LoginPage tipinde bir değişken yapıp ordan object oluşturdu
        setDriver(new ChromeDriver(options));
        getDriver().navigate().to("https://www.hepsiburada.com/");
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setDriver(WebDriver driver) {
        BaseTest.driver = driver;
    }
}
