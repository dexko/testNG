package HW5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Captcha {
    private WebDriver webDriver;
    @FindBy(xpath = "//a[contains(@href,\"he-new-marc-jacobs-gotham-saddle-bag\")]")
    public WebElement readMore;
    @FindBy(id = "author")
    public WebElement commentName;
    @FindBy(id = "email")
    public WebElement commentMail;
    @FindBy(id = "comment")
    public WebElement comment;
    @FindBy(id = "submit")
    public WebElement submit;
    @FindBy(id = "error-page")
    public WebElement error;


    public Captcha(WebDriver webDriver){
        this.webDriver=webDriver;
        PageFactory.initElements(webDriver, this);
    }
    public void captcha(String name, String mail, String note){
        readMore.click();
        commentName.sendKeys(name);
        commentMail.sendKeys(mail);
        comment.sendKeys(note);
        submit.click();
        error.isEnabled();
    }

}
