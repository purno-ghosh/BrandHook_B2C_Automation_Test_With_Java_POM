package Login_Page;
import Helping_Files.Setup;
import Helping_Files.Utils;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class Login_Runner extends Setup {
Login testlogin;
    Utils utils;
//Login functionality test with Valid email and valid password
    @Test(enabled = true, priority = 2)
    public void  Login_With_Valid_user() throws IOException, ParseException, InterruptedException {
        driver.get("https://brandhook.com.bd/");
        testlogin= new Login(driver);
        utils = new Utils(driver);
        utils.readJSONArray(0);
        String nn1=testlogin.Login_With_Valid_user(utils.getEmail(), utils.getPassword());
        Assert.assertEquals(nn1, "Purna");
        System.out.println(nn1);

    }
    //Login functionality test with inValid email and valid password
    @Test(enabled = true, priority = 1)
    public void  Login_With_Invalid_email() throws IOException, ParseException, InterruptedException {
        driver.get("https://brandhook.com.bd/");
        testlogin= new Login(driver);
        utils = new Utils(driver);
        utils.readJSONArray(1);
        String nn2=testlogin.Login_With_Invalid_email(utils.getEmail(), utils.getPassword());
        Assert.assertEquals(nn2, "Invalid login credentials");
        System.out.println(nn2);

    }
    //Login functionality test with Valid email and invalid password
    @Test(enabled = true, priority = 0)
    public void  Login_With_Invalid_password() throws IOException, ParseException, InterruptedException {
        driver.get("https://brandhook.com.bd/");
        testlogin= new Login(driver);
        utils = new Utils(driver);
        utils.readJSONArray(2);
        String nn3=testlogin.Login_With_Invalid_password(utils.getEmail(), utils.getPassword());
        Assert.assertEquals(nn3, "Invalid login credentials");
        System.out.println(nn3);

    }



}
