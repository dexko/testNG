package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTestPageObject{
    private WebDriver webDriver;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        setWebDriver(webDriver);
        webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    @AfterMethod
    public void killDriver() {
        getWebDriver().quit();
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }

    public void setWebDriver(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
    @AfterMethod
    public void closeDriver(){
        webDriver.quit();
    }

    @Step("{0}")
    public void allureLog(String message){
        System.out.println(message);
        saveScreenshotPNG();
    }
    @Attachment(value = "page screenshot", type="image/png")
    public byte[] saveScreenshotPNG(){return ((TakesScreenshot) getWebDriver()).getScreenshotAs(OutputType.BYTES);

    }
}
