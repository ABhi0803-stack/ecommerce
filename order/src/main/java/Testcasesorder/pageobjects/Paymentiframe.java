package Testcasesorder.pageobjects;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Orderflow.Absractcomponents.Abstractdata;



public class Paymentiframe extends Abstractdata {

	WebDriver driver;
	
	public  Paymentiframe(WebDriver driver)
	{
		super(driver);
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//div[@data-value='netbanking']")
	WebElement paymenttype;
	
	
	@FindBy(xpath="//div[@data-value='CNRB']")
	WebElement bankselect;
	By succes = By.xpath("//button[@class='success']");
	
	
	@FindBy(xpath="//button[@class='success']")
	WebElement elementInNewWindow;
	
	By orderpage = By.xpath("//div[@class='MuiGrid-root MuiGrid-container jss209 css-1d3bbye']");
	
	
	public void paymentmode() throws InterruptedException
	{
		
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement iframe = wait2.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath("//iframe[@class='razorpay-checkout-frame']")));

		driver.switchTo().frame(iframe);
		
		paymenttype.click();
		bankselect.click();
		String mainWindowHandle = driver.getWindowHandle();
		Set<String> allWindowHandles = driver.getWindowHandles();
		allWindowHandles.remove(mainWindowHandle);
		String newWindowHandle = allWindowHandles.iterator().next();
		driver.switchTo().window(newWindowHandle);
		wait2.until(ExpectedConditions.elementToBeClickable(succes));
		elementInNewWindow.click();
		driver.switchTo().window(mainWindowHandle);	
		
		
		
		
	}
	
	
	
	
	
	
}
