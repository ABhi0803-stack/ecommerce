package Testcasesorder.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Orderflow.Absractcomponents.Abstractdata;

import java.time.Duration;

public class Checkoutpage extends Abstractdata {

	WebDriver driver;

	public Checkoutpage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[text()='Continue']")
	WebElement Continuebutton;
	By checkoutbut = By.xpath("//button[text()='Checkout']");
	By updatebutton = By.xpath("//button[text()='Update Cart']");

	@FindBy(xpath = "//div[text()='My billing and shipping address are the same']")
	WebElement clickaddress;

	By prepaid = By.cssSelector("svg[width='356']");

	public void itemcheckout() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		wait.until(ExpectedConditions.visibilityOfElementLocated(checkoutbut));
		driver.findElement(checkoutbut).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(updatebutton));
		

		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement address = driver
				.findElement(By.xpath("//div[text()='My billing and shipping address are the same']"));
		js.executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center' });", address);
		address.click();

		WebElement payment = driver.findElement(By.cssSelector("svg[width='356']"));
		js.executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center' });", payment);
		payment.click();

		
		WebElement summary = driver.findElement(By.xpath("//h4[contains(@class, 'css-2igov7') and text()='Summary']"));
		js.executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center' });", summary);

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Proceed to Buy']")));

		WebElement proceedtobuy = driver.findElement(By.xpath("//button[text()='Proceed to Buy']"));
		js.executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center' });", proceedtobuy);

		Thread.sleep(4000);
		proceedtobuy.click();
	}
}
