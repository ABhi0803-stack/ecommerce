package Mainproject.Tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Testcasesorder.pageobjects.Landingpage;
import Testcasesorder.pageobjects.Mainpage;
import Testcasesorder.pageobjects.Orderdetailspage;
import Testcasesorder.pageobjects.Orderhistory;
import Testcasesorder.pageobjects.Summarypage;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

public class Track {
	static WebDriver driver;
	static ExtentReports extent;
	static ExtentTest test;

	@BeforeAll
	public static void setUp() {

		ExtentSparkReporter sparkReporter = new ExtentSparkReporter(
				"C:/Users/rangaraju.r.PAI/Desktop/spark-test-track-report.html");

		extent = new ExtentReports();
		extent.attachReporter(sparkReporter);

	}

	@Test
	public void fromcart() throws InterruptedException {
		test = extent.createTest("fromcart Test");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		String sname = "FandB Shop";

		Landingpage landingpage = new Landingpage(driver);
		landingpage.loginurl();
		landingpage.loginapp("abhis1406@gmail.com", "Abhi@1998");
		test.pass("Logged in successfully");

		Mainpage mainpage = new Mainpage(driver);
		mainpage.pincode();
		test.pass("Entered pincode");

		Summarypage summarypage = new Summarypage(driver);
		summarypage.profilclick();
		summarypage.orderhistory();
		test.pass("Navigated to order history");

		Orderhistory orderhistory = new Orderhistory(driver);
		orderhistory.ongoing(sname);
		test.pass("Selected ongoing order");

		Orderdetailspage orderdetailspage = new Orderdetailspage(driver);
		orderdetailspage.scrollin();
		orderdetailspage.track();
		test.pass("Tracking the order");

		test.pass("Test completed successfully");
	}

	@AfterAll
	public static void tearDown() {
		if (driver != null) {
			driver.quit();
		}
		extent.flush();
	}

}
