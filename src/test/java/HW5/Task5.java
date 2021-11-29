package HW5;

import PageObjectModel.BacePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Task5 extends BacePage {

    private final By addWishlist = By.xpath("//*[@data-product-id=\"704\"]");
    private final By product = By.xpath("//*[@class=\"noo-product-item noo-product-sm-4 not_featured post-704 product type-product status-publish has-post-thumbnail product_cat-dress product_tag-dress product_tag-women has-featured first instock sale shipping-taxable purchasable product-type-variable has-default-attributes\"]");
    private final By wishlist = By.xpath("//a[contains(@href,\"wishlist\")][1]");
    private final By insideWishlist =By.id("yith-wcwl-row-704");
    private final By invisible = By.xpath("//*[@data-product-id=\"704\"]");

    public Task5(WebDriver webDriver) {
        super(webDriver);
    }
    public void addToWishlist(){
        Actions action = new Actions(webDriver);
        WebElement we = webDriver.findElement(product);
        action.moveToElement(we).moveToElement(webDriver.findElement(addWishlist)).click().build().perform();
        invisibilityWait(invisible,100);

    }
    public void goToWishlist(){

        click(wishlist);
    }
    public void checkWishlist(){
        elementEnabled(insideWishlist);
}}
