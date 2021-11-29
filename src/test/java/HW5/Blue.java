package HW5;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Blue {
    private WebDriver webDriver;
    @FindBy(xpath = "//*[@class=\"noo-search\"]")
    public WebElement searching;
    @FindBy(xpath = "//*[@class=\"form-control\"]")
    public WebElement look;
    @FindBy(name = "filter_size")
    public WebElement size;
    @FindBy(xpath = "//a[contains(@href,\"blue-sinner-ripped-knee-high-waist-skinny-jeans\")]")
    public WebElement firstProduct;
    @FindBy(xpath = "//*[@id=\"pa_color\"]")
    public WebElement color;
    @FindBy(xpath = "//*[@id=\"pa_size\"]")
    public WebElement chooseSize;
    @FindBy(xpath = "//*[@id=\"product-1406\"]/div[1]/div[2]/form/div/div[2]/button")
    public WebElement cart;
    @FindBy(xpath = "//*[@id=\"nav-menu-item-cart\"]")
    public WebElement goToCart;
    @FindBy(xpath = "//*[@class=\"cart_item\"]")
    public WebElement itemInCart;

    public Blue(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    public void choseBlue(String input, String sizeValue, String colorValue) {
        searching.click();
        look.sendKeys(input);
        look.sendKeys(Keys.ENTER);
        Select select = new Select(size);
        select.selectByValue(sizeValue);
        JavascriptExecutor executor = (JavascriptExecutor) webDriver;
        executor.executeScript("arguments[0].click();",firstProduct);

        Select select2 = new Select(color);
        select2.selectByValue(colorValue);
        Select select3 = new Select(chooseSize);
        select3.selectByValue("37");
        cart.click();
        goToCart.click();
        itemInCart.isEnabled();
    }
}
