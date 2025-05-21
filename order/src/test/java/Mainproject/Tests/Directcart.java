package Mainproject.Tests;

import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Testcasesorder.pageobjects.Checkoutpage;
import Testcasesorder.pageobjects.Landingpage;
import Testcasesorder.pageobjects.Mainpage;
import Testcasesorder.pageobjects.Orderdetailspage;
import Testcasesorder.pageobjects.Orderhistory;
import Testcasesorder.pageobjects.Paymentiframe;

public class Directcart {

	static WebDriver driver;
	static ExtentReports extent;
	static ExtentTest test;

	@BeforeAll
	public static void setUp() {

		ExtentSparkReporter sparkReporter = new ExtentSparkReporter(
				"C:/Users/rangaraju.r.PAI/Desktop/spark-test-Placingorder-report.html");

		extent = new ExtentReports();
		extent.attachReporter(sparkReporter);

	}

	@Test
	public void placedorder() throws InterruptedException {
		test = extent.createTest("fromcart Test");
		WebDriver driver = new ChromeDriver();

		String sname = "FandB Shop";

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		Landingpage landingpage = new Landingpage(driver);
		landingpage.loginurl();
		landingpage.loginapp("abhis1406@gmail.com", "Abhi@1998");
		test.pass("Logged in successfully");

		Mainpage mainpage = new Mainpage(driver);
		mainpage.pincode();
		landingpage.cartbutton();
		test.pass("clicked on cart successfully");

		Checkoutpage checkoutpage = new Checkoutpage(driver);
		checkoutpage.itemcheckout();
		test.pass("Item checked out successfully");

		Paymentiframe paymentiframe = new Paymentiframe(driver);
		paymentiframe.paymentmode();
		test.pass("Payment done successfully");

		Orderhistory orderhistory = new Orderhistory(driver);
		orderhistory.ongoing(sname);

		Orderdetailspage orderdetails = new Orderdetailspage(driver);
		orderdetails.ordernumber();
		test.pass("Order no captured successfully");

		test.pass("Test order placed successfully");

	}

	@AfterAll
	public static void tearDown() {
		if (driver != null) {
			driver.quit();
		}
		extent.flush();
	}

}
