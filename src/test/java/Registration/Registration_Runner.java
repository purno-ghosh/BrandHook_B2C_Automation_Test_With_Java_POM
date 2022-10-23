package Registration;

import Helping_Files.Setup;
import Helping_Files.Utils;
import Login_Page.Login;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class Registration_Runner extends Setup {
    Registration_Page testReg;
    Utils utils;


    @Test(enabled = true, priority = 0)
    public void Do_Registration() throws IOException, ParseException, InterruptedException {
        driver.get("https://brandhook.com.bd/");
        testReg = new Registration_Page(driver);
        utils = new Utils(driver);
        utils.readJSONArray(4);
        String nn4 = testReg.Do_Registration(utils.getName(), utils.getEmail(), utils.getPassword());
        Assert.assertEquals(nn4, "Registration successful. Please verify your email.");
        System.out.println(nn4);

    }

}
