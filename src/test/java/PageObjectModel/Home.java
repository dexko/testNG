package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Home extends BacePage {
    private final By addWishlist = By.xpath("//*[@data-product-id=\"704\"]");
    private final By product = By.xpath("//*[@class=\"noo-product-item noo-product-sm-4 not_featured post-704 product type-product status-publish has-post-thumbnail product_cat-dress product_tag-dress product_tag-women has-featured first instock sale shipping-taxable purchasable product-type-variable has-default-attributes\"]");
    private final By wishlist = By.xpath("//a[contains(@href,\"wishlist\")][1]");
    private final By invisible = By.xpath("//*[@data-product-id=\"704\"]");
    private final By shirt = By.xpath("//a[contains(@href,\"pink-drop-shoulder-oversized-t-shirt\")]");

    public Home(WebDriver webDriver) {
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
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        wait.until(ExpectedConditions.invisibilityOf(webDriver.findElement(wishlist)));

    }
    public void selectItem(){

        JavascriptExecutor executor = (JavascriptExecutor) webDriver;
        executor.executeScript("arguments[0].click();",webDriver.findElement(shirt));
    }
}
