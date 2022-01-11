package forAPItest;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class ForSelenide {
    @Test
    public void selenideTest() {
        open("https://demo.nopcommerce.com/build-your-own-computer");
        //Select select = new Select ($(By.name("product_attribute_1")));
        //select.selectByValue("1");
        $(By.name("product_attribute_1")).selectOptionByValue("1");
        $(By.name("product_attribute_2")).selectOptionByValue("5");
        $(By.name("product_attribute_3")).click();
        $(By.name("product_attribute_4")).setSelected(true);
        $(By.id("add-to-cart-button-1")).click();
        $(By.id("topcartlink")).click();
        $(By.xpath("//*[@class=\"attributes\"]")).ancestor("HDD: 320 GB RAM: 2 GB");
    }


}
