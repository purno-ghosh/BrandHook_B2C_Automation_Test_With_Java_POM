package Registration;
import java.io.IOException;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class Registration_Page {
    WebDriver driver;
    @FindBy(xpath = "//a[contains(.,'Registration')]")
    WebElement Regbtnclk;
    @FindBy(xpath = "//input[contains(@name,'name')]")
    WebElement Fullname;
    @FindBy(id = "gender")
    WebElement selGen;
    @FindBy(xpath = "//input[contains(@name,'email')]")
    WebElement regemail;
    @FindBy(xpath = "//input[@name='password']")
    WebElement regpass;
    @FindBy(xpath = "//input[contains(@name,'confirmation')]")
    WebElement regpassconfirm;
    @FindBy(xpath = "//span[@class='aiz-square-check']")
    WebElement confirmbtn;
    @FindBy(xpath = "//button[contains(@type,'submit')]")
    WebElement Submitbtn;
    @FindBy(xpath = "//span[@data-notify='message'][contains(.,'Registration successful. Please verify your email.')]")
    WebElement RegAssert;


    public Registration_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory pageFactory;
        PageFactory.initElements(driver, this);
    }


    public String Do_Registration(String name, String email, String password) throws IOException, ParseException, InterruptedException {
        Regbtnclk.click();
        Fullname.sendKeys(name);
        Select drop = new Select(selGen);
        drop.selectByValue("Female");
        Thread.sleep(2000);
        regemail.sendKeys(email);
        regpass.sendKeys(password);
        regpassconfirm.sendKeys(password);
        confirmbtn.click();
        Submitbtn.click();
        Thread.sleep(2000);
        return  RegAssert.getText();


    }


}
