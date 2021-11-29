package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WishList extends BacePage {
    private final By insideWishlist =By.id("yith-wcwl-row-704");
    public WishList(WebDriver webDriver) {
        super(webDriver);
    }
    public void checkWishlist(){
        elementEnabled(insideWishlist);
    }}



