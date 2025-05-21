package Testcasesorder.pageobjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Orderflow.Absractcomponents.Abstractdata;



public class Orderdetailspage extends Abstractdata {

	WebDriver driver;

	public Orderdetailspage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Download Invoice']")
	WebElement downloadInvoice;

	@FindBy(xpath = "//button[text()='Raise Issue']")
	WebElement raiseIssue;

	@FindBy(xpath = "//button[text()='Get Status']")
	WebElement getStatus;

	@FindBy(xpath = "//button[text()='Track']")
	WebElement track;
	@FindBy(xpath = "//button[text()='Cancel Order']")
	WebElement cancel;
	@FindBy(xpath = "//button[text()='Return Order']")
	WebElement returnorder;
	
	@FindBy(xpath = "//button[text()='Confirm']")
	WebElement confirmincancel;
	@FindBy(xpath = "//button[text()='Cancel']")
	WebElement cancelincancel;
	
	@FindBy(xpath = "//div[@class='checkbox_checkbox_background__ci-7G']")
	WebElement checkbox;

	@FindBy(id = "dropdownOne")
	WebElement canceldropdwon;
	@FindBy(id = "shortDes")
	WebElement shortDes;
	@FindBy(id = "longDes")
	WebElement longDes;
	By complaintraised = By.xpath("//div[text()='Complaint raised successfully!']");
	
	public void scrollin() throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement scro = driver.findElement(By.xpath("//button[text()='Get Status']"));
		js.executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center' });", scro);

	}
	
	public void downloadInvoice() {

		downloadInvoice.click();

	}
	
	public void raiseIssue() {

		raiseIssue.click();
		checkbox.click();
		shortDes.sendKeys("foraitest");
		longDes.sendKeys("for automation");
		confirmincancel.click();
		waitforelementtovisible(complaintraised);
		System.out.println(driver.findElement(complaintraised).getText());

	}

	public void getStatus() {

		getStatus.click();

	}
	
	public void track() {

		track.click();

	}
	
	public void cancel(String cancelreason) {

		cancel.click();
		// canceldropdwon.click();
		Select candropdown = new Select(canceldropdwon);
		candropdown.selectByVisibleText(cancelreason);
		confirmincancel.click();

	}
	
	
	public void returnorder() {

		returnorder.click();

	}
	By orderdetails =By.xpath("//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiCard-root jss252 css-1k2asu5']");
	
	public void ordernumber() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			
		wait.until(ExpectedConditions.visibilityOfElementLocated(orderdetails));
		String orderno = driver.findElement(By.xpath("//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiCard-root jss252 css-1k2asu5']//span")).getText();
		
	
	System.out.println(orderno);
	}

	
}