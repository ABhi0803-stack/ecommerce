// Placingorder.java
package Mainproject.Tests;

import Mainproject.Testcomponents.BaseTest;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Testcasesorder.pageobjects.*;

public class Placingorder extends BaseTest {
	   
    @Test
    public void placingOrder() throws InterruptedException, IOException {
         
        	
        	 
        

            String cname = "Beverage";
            String sname = "DS super market hsr layout Customization";
            String itemcat = "Biryani and others (custom)";
            String itemname = "Chicago Style.";

            Landingpage landingpage = new Landingpage(driver);
            landingpage.loginurl();
            landingpage.loginapp("abhis1406@gmail.com", "Abhi@1998");

            Mainpage mainpage = new Mainpage(driver);
            mainpage.pincode();
            mainpage.bcategory(cname);

            Storeselection storeselection = new Storeselection(driver);
            storeselection.scrollapage();
            storeselection.selectstore(sname);

            Merchnatpage merchnatpage = new Merchnatpage(driver);
            merchnatpage.selectitems(itemcat, itemname);

            Itemqty itemqty = new Itemqty(driver);
            itemqty.additionofitem();

            Checkoutpage checkoutpage = new Checkoutpage(driver);
            checkoutpage.itemcheckout();

            Paymentiframe paymentiframe = new Paymentiframe(driver);
            paymentiframe.paymentmode();

        
    }
    @AfterClass
    public void cleanUps() { 
    	cleanUp();  // Close the browser after tests
    }
}
