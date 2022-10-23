package ADD_ProductPage;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;


public class Add_Product {
    WebDriver driver;

    @FindBy(xpath = "(//a[contains(.,'Login')])[1]")
    WebElement loginbtn;
    @FindBy(id = "email")
    WebElement emailfield;
    @FindBy(id = "password")
    WebElement passwordfield;
    @FindBy(xpath = "//button[contains(.,'Login')]")
    WebElement loginclick;
    @FindBy(xpath = "//img[@src='https://brandhook.s3.ap-south-1.amazonaws.com/uploads/all/0WT96qPQl0bahhsR6pKHMm5skxQaPgnEQcxp5ou0.webp']")
    WebElement homepage;

    @FindBy(id = "search")
    WebElement searchbtn;

    @FindBy(xpath = "(//a[@class='d-block text-reset'][contains(.,'MOBVOI')])[1]")
    WebElement Smartwatchbtn;
    @FindBy(xpath = "//a[@href='https://brandhook.com.bd/product/ticwatch-gth-smart-watch-spo2-with-skin-temperature-sensor-raven-black'][contains(.,'Ticwatch GTH Smart Watch SpO2 with Skin Temperature Sensor-Raven Black')]")
    WebElement watchclik;
    @FindBy(id = "addtocart")
    WebElement Addcardclick;

    @FindBy(xpath = "//a[contains(.,'Proceed to Checkout')]")
    WebElement Proceedclk;
    @FindBy(xpath = "//button[contains(.,'Continue to Shipping')]")
    WebElement ContinueShopping;

    @FindBy(xpath = "//span[contains(@class,'aiz-rounded-check flex-shrink-0 mt-1 ')]")
    WebElement SelectAdress;
    @FindBy(xpath = "//button[contains(.,'Continue to Delivery Info')]")
    WebElement ContinueDelivery;
    @FindBy(xpath = "//button[contains(.,'Continue to Payment')]")
    WebElement Continuepayment;
    @FindBy(xpath = "//h3[contains(.,'Order Summary')]")
    WebElement Odersum;

    public Add_Product(WebDriver driver) {
        this.driver = driver;
        PageFactory pageFactory;
        PageFactory.initElements(driver, this);
    }

    public String Product_find_purchase(String email, String password, String item) throws IOException, ParseException, InterruptedException {
        loginbtn.click();
        emailfield.sendKeys(email);
        passwordfield.sendKeys(password);
        loginclick.click();
        Thread.sleep(2000);
        homepage.click();
        Thread.sleep(3000);
        searchbtn.sendKeys(item, Keys.ENTER);
        Thread.sleep(2000);
        Smartwatchbtn.click();
        watchclik.click();
        Addcardclick.click();
        Proceedclk.click();
        ContinueShopping.click();
        SelectAdress.click();
        ContinueDelivery.click();
        Continuepayment.click();
        return Odersum.getText();

    }


}
