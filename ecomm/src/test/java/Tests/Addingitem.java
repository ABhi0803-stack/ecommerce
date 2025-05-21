package Tests;

import org.testng.annotations.Test;

import bases.BaseTest;
import pages.Checkoutpage;
import pages.Homepage;
import pages.Loginpage;
import pages.Paymentpage;
import pages.Productpage;

public class Addingitem extends BaseTest {
	@Test
	public void verifysignup() {
		Loginpage login = new Loginpage(driver);
		login.clickLogin();
		Homepage home = new Homepage(driver);
		home.Products();
		Productpage product = new Productpage(driver);
		product.Addingtocart();
		Checkoutpage check = new Checkoutpage(driver);
		check.placeOrder();

		Paymentpage payment = new Paymentpage(driver);
		payment.Carddetails();
	}

}
