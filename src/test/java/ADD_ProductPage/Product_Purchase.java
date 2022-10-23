package ADD_ProductPage;

import Helping_Files.Setup;
import Helping_Files.Utils;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class Product_Purchase extends Setup {

    Add_Product AddPro;
    Utils utils;

    @Test(enabled = true, priority = 0)
    public void  Product_find_purchase() throws IOException, ParseException, InterruptedException {
        driver.get("https://brandhook.com.bd/");
        AddPro= new Add_Product(driver);
        utils = new Utils(driver);
        utils.readJSONArray(0);
        String nn4=AddPro.Product_find_purchase(utils.getEmail(), utils.getPassword(), utils.getItem());
        Assert.assertEquals(nn4, "Order Summary");
        System.out.println(nn4);

    }

}
