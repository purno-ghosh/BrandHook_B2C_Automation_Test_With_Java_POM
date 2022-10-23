package Login_Page;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class Login {
    WebDriver driver;

    @FindBy(xpath = "(//a[contains(.,'Login')])[1]")
    WebElement loginbtn;
    @FindBy(id = "email")
    WebElement emailfield;
    @FindBy(id = "password")
    WebElement passwordfield;
    @FindBy(xpath = "//button[contains(.,'Login')]")
    WebElement loginclick;
    @FindBy(xpath = "(//h4[contains(.,'Purna')])[1]")
    WebElement AccountAssert;
    @FindBy(xpath = "//div[@data-notify='container'][contains(.,'Invalid login credentials')]")
    WebElement InvalidemailAssert;

    public Login(WebDriver driver) {
        this.driver = driver;
        PageFactory pageFactory;
        PageFactory.initElements(driver, this);
    }

    public String Login_With_Valid_user(String email, String password) throws IOException, ParseException, InterruptedException {
        loginbtn.click();
        emailfield.sendKeys(email);
        passwordfield.sendKeys(password);
        loginclick.click();
        Thread.sleep(2000);
        return AccountAssert.getText();
    }

    public String Login_With_Invalid_email(String email, String password) throws IOException, ParseException, InterruptedException {
        loginbtn.click();
        emailfield.sendKeys(email);
        passwordfield.sendKeys(password);
        loginclick.click();
        Thread.sleep(2000);
        return InvalidemailAssert.getText();
    }

    public String Login_With_Invalid_password(String email, String password) throws IOException, ParseException, InterruptedException {
        loginbtn.click();
        emailfield.sendKeys(email);
        passwordfield.sendKeys(password);
        loginclick.click();
        Thread.sleep(2000);
        return InvalidemailAssert.getText();
    }


}
