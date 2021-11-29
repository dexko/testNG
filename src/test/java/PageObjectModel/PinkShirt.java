package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PinkShirt extends BacePage {

    private final By shirt = By.xpath("//a[contains(@href,\"pink-drop-shoulder-oversized-t-shirt\")]");
    private final By color = By.xpath("//*[@id=\"pa_color\"]");
    private final By size = By.xpath("//*[@id=\"pa_size\"]");
    private final By quantity =By.xpath("//*[@id=\"product-1497\"]/div[1]/div[2]/form/div/div[2]/div/div/button[2]");
    private final By cart = By.xpath("//*[@id=\"product-1497\"]/div[1]/div[2]/form/div/div[2]/button");
    private final By goToCart = By.xpath("//*[@id=\"nav-menu-item-cart\"]");


    public PinkShirt(WebDriver webDriver) {
        super(webDriver);
    }

    public void chooseColor(){
        elementSelect(color,"pink");

    }
    public void chooseSize(){
        elementSelect(size,"37");

}
    public void chooseQuantity(){
        for (int i=1; i<3; i++){
        click(quantity);
    }}
    public void addToCart(){
        click(cart);
        /*WebDriverWait wait = new WebDriverWait(webDriver, 20);
        wait.until(ExpectedConditions.alertIsPresent());
        webDriver.switchTo().alert().accept();*/
    }
    public void goToCart(){
        click(goToCart);
    }

}

