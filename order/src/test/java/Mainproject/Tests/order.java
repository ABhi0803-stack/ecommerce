package Mainproject.Tests;

import java.time.Duration;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Testcasesorder.pageobjects.Checkoutpage;
import Testcasesorder.pageobjects.Itemqty;
import Testcasesorder.pageobjects.Landingpage;
import Testcasesorder.pageobjects.Mainpage;
import Testcasesorder.pageobjects.Merchnatpage;
import Testcasesorder.pageobjects.Paymentiframe;
import Testcasesorder.pageobjects.Storeselection;

public class order {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();

		String cname = "Beverage";
		String sname = "DS super market hsr layout Customization";
		String itemcat = "Biryani and others (custom)";
		String itemname = "Chicago Style.";
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

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
		merchnatpage.selectitems(itemcat,itemname);
		
		
		Itemqty itemqty = new Itemqty(driver);
		itemqty.additionofitem();
		
		
		Checkoutpage checkoutpage = new Checkoutpage(driver);
		checkoutpage.itemcheckout();
		
		
		Paymentiframe paymentiframe  = new Paymentiframe(driver);
		paymentiframe.paymentmode();
		
			
	}
	
	
	

}
