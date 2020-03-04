package com.garantibbva.page;

import com.garantibbva.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
        // superin mevzusu da ben onun constructer'ını ezerim.
        //yani gidip basePage'in constructor'ını ezebiliyor yani.
    }

    public void login(String username, String password) {
        //extend ettiğin için direkt sendKeys diyebiliyorsun.

        sendKeys(By.id("username"), "username");

    }
}
