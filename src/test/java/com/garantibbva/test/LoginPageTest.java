package com.garantibbva.test;

import com.garantibbva.base.BaseTest;
import com.garantibbva.page.LoginPage;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPageTest extends BaseTest {
    LoginPage loginPage;

    @Before
    public void before() {
//        System.setProperty("webdriver.chrome.driver", "properties/driver/chromedriver.exe");
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("start-maximized");
//        ///Burası önemli LoginPage tipinde bir değişken yapıp ordan object oluşturdu
        loginPage = new LoginPage(getDriver());
      //  loginPage.navigationToUrl("https://www.hepsiburada.com/");
        //
    }

    @Test
    public void loginTest() {
        loginPage.login("semihsaydamz@gmail.com", "123qweasd");
        loginPage.complete();
        //
    }
}
