package com.garantibbva.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import junit.framework.AssertionFailedError;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class SearchTest
{
    WebDriver driver; // global tanımladın.
    WebDriverWait wait;

    @Before
    public void setUp(){
//        System.setProperty("webdriver.chrome.driver","properties/driver/chromedriver.exe");
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("start-maximized");
//        driver = new ChromeDriver();
//        wait = new WebDriverWait(driver,60);

     //4 mart
       // driver.navigate().to("https://www.hepsiburada.com/");
//        hoverElement(By.id("myAccount"));
//        clickElement(By.id("login"));
//        sendKeys(By.id("email"),"semihsaydamz@gmail.com");
//        sendKeys(By.id("password"),"123qweasd");
//        clickElement(By.xpath("//*[@id=\'form-login\']/div[4]/button"));



       // clickElement(By.className("btnSignUp")); //üye ol tıkla
       // sendKeys(By.id("firstName"),"Semih");
       // sendKeys(By.id("lastName"),"Saydam");
       // sendKeys(By.id("registrationEmail"),"semihsaydamz@gmail.com");
       // sendKeys(By.id("registrationPassword"),"123456");
       // sendKeys(By.id("passwordAgain"),"123456");
       // clickElement(By.id("phoneNumber"));
       // sendKeys(By.id("phoneNumber"),"536041371");
       // clickElement(By.xpath("//*[@id='genderMale']/parent::div"));
    //

     //   Select date = new Select(driver.findElement(By.id("birthDay")));
     //   date.selectByVisibleText("13");

     //   Select month = new Select(driver.findElement(By.id("birthMonth")));
     //   month.selectByVisibleText("Eylül");

      //  Select year = new Select(driver.findElement(By.id("birthYear")));
      //  year.selectByVisibleText("1994");

        //yukarının en kapsüle hali önce ay yap, gün değişir
       // selectOption(By.id("birthMonth"),"Eylül");
       // selectOption(By.id("birthDay"),"13");
       // selectOption(By.id("birthYear"),"1994");

        //String myName = getText(By.className("user-name"));
        //assertTrue(myName.equals("semih saydam"));

    }
    @Test
    public void googleSearchTest() throws InterruptedException {
        //driver.findElement(By.name("q")).sendKeys("Emre");
        //WebElement element = driver.findElement(By.name("q"));
        //element.sendKeys("emre");
        //element.submit();
  //      sendKeys(By.name("q"),"semih");  //yukarıdaki 3 satırı tek satıra dönüştürdün
       // wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("li[data-view-type='1']")));
        //bu beklemeyi de enkapsüle edeceğiz.
  //      clickElement(By.cssSelector("li[data-view-type='1']"));  //burada da findElement(by.name("")).click'ten kaçtın ve sadeleştirdin
       // TimeUnit.SECONDS.sleep(5);  //bunun yerine WebDriverWait ile dinamik bekleme yapmalısın.

        driver.quit();
    }

}
