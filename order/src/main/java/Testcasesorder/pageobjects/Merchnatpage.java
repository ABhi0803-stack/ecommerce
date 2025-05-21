package Testcasesorder.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Orderflow.Absractcomponents.Abstractdata;
public class Merchnatpage extends Abstractdata {

	WebDriver driver;

	public Merchnatpage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='MuiBox-root css-1o7pqxs']")
	List<WebElement> itemcatlist;
	@FindBy(xpath = "//div[@class='MuiTypography-root MuiTypography-body jss553 jss554 css-1ti4s1m']")
	List<WebElement> itemnamelist;

	public void selectitems(String itemcat,String itemname) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement menu = driver.findElement(By.xpath("//button[text()='Menu']"));
		js.executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center' });", menu);
		menu.click();
		for (WebElement itemfull : itemcatlist) {
			//System.out.println(fullcat.getText().trim());
			String it=itemfull.getText().trim();
			if(it.contains(itemcat))
			{
				WebElement Itecateg = driver.findElement(By.xpath("//div[@class='MuiBox-root css-1o7pqxs']//div//div[text()='"+itemcat+"']"));
				Itecateg.click();
				WebElement itemname1 = driver.findElement(By.xpath("//div[@class='MuiBox-root css-1o7pqxs']//p[text()='"+itemname+"']"));
				itemname1.click();
				
				break;
			}
		
	}	
}
}

