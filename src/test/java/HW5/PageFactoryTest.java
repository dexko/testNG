package HW5;

import base.BaseTest;
import base.BaseTestPageObject;
import org.testng.annotations.Test;

public class PageFactoryTest extends BaseTestPageObject {
    @Test
    public void withoutCaptchaTest(){
        getWebDriver().get("http://shop.demoqa.com/author/lsharm/");
        Captcha without = new Captcha(getWebDriver());
        without.captcha("Ivan","res@gmail.com","nice");
        allureLog("Test passes without captcha");


    }
    @Test
    public void blueItem(){
        getWebDriver().get("http://shop.demoqa.com");
        Blue blue = new Blue(getWebDriver());
        blue.choseBlue("Blue","94","blue");
        allureLog("Test passes with blue item");
    }
}
