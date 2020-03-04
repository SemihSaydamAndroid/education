package com.garantibbva.page;

import com.garantibbva.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static com.garantibbva.constants.ConstantsLoginPage.*;    //GIRIS YAP almak için yapılan import.

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
        // superin mevzusu da ben onun constructer'ını ezerim.
        //yani gidip basePage'in constructor'ını ezebiliyor.
    }


//    public void login(String username, String password) {
//        //extend ettiğin için direkt sendKeys diyebiliyorsun.
//
//        sendKeys(By.id("username"), "username");
//    }
//
//    public void complete() {
//        clickElement(By.id("okBtn"));
//    }
//
//
//
//    önce böyleydi.

    public LoginPage login(String username, String password) {
        //extend ettiğin için direkt sendKeys diyebiliyorsun.
        sendKeys(By.id("username"), "username");
        return this;
    }

    public LoginPage complete() {
        clickElement(GIRIS_YAP);   //GIRIS_YAP olarak ConstantsLoginPage.java ile aldık.

        return this;
    }
    //bu yöntemle kendini döndüğü için TEKRAR KULLANILABİLİR OLUYOR METHOD VE login("","").complete diyebilirsin artık. Çok iyi bilgi.
    //yani bunla beraber tekrar eden bir işlem bütünü yapabilirsin. recorsive gibi bir şey adı var bu işlemin.

}
