package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cart extends BacePage {
    private final By shirt = By.xpath("//a[contains(@href,\"pink-drop-shoulder-oversized-t-shirt\")]");
    public Cart(WebDriver webDriver) {
        super(webDriver);
    }
    public void checkCart(){
        elementEnabled(shirt);
    }
}
