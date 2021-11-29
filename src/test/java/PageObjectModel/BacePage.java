package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BacePage {
    protected WebDriver webDriver;



    public BacePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void setKeys(By locator, String input) {
        webDriver.findElement(locator).sendKeys(input);
    }

    public void click(By locator) {
        webDriver.findElement(locator).click();

    }

    public void invisibilityWait(By locator, int timeWait) {
        WebDriverWait wait = new WebDriverWait(webDriver, timeWait);
        wait.until(ExpectedConditions.invisibilityOf(webDriver.findElement(locator)));

    }

    public void elementEnabled(By locator) {
        webDriver.findElement(locator).isEnabled();
    }

    public void elementSelect(By locator, String value) {
        Select select = new Select(webDriver.findElement(locator));
        select.selectByValue(value);
    }
}

