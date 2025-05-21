package Testcasesorder.pageobjects;

import java.util.ArrayList;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Orderflow.Absractcomponents.Abstractdata;



public class Orderhistory extends Abstractdata {

	WebDriver driver;
	
	
	public  Orderhistory(WebDriver driver)
	{
		super(driver);
		this.driver =driver;
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//button[text()='Ongoing']")
	WebElement ongoing;
	@FindBy(xpath="//button[text()='Completed']")
	WebElement completed;
	@FindBy(xpath="//button[text()='Cancelled']")
	WebElement cancelled;
	//div[text()='Ordered On: 08 January 2025 at 11:35pm']//button[text()='View summary']
	
	@FindBy(xpath="//button[text()='Cancelled']")
	WebElement summary;
	
	public void ongoing(String sname) throws InterruptedException
	{
		//ongoing.click();
		String  orderdateandtime = driver.findElement(By.xpath("//div[text()='"+sname+"']/following-sibling::div")).getText();

		String[] parts = orderdateandtime.split("View");
		ArrayList<String> orderDetails = new ArrayList<>();
		for (String part : parts) {
		    orderDetails.add(part.trim());
		}
		String firstElement = orderDetails.get(0);
		System.out.println(firstElement);
		
		WebElement summary= driver.findElement(By.xpath("//div[text()='"+firstElement+"']//button[text()='View summary']"));
		summary.click();
		Thread.sleep(2000);
	}
	
	
	public void completed(String sname)
	{
		
		completed.click();
		String  orderdateandtime = driver.findElement(By.xpath("//div[text()='"+sname+"']/following-sibling::div")).getText();

		String[] parts = orderdateandtime.split("View");
		ArrayList<String> orderDetails = new ArrayList<>();
		for (String part : parts) {
		    orderDetails.add(part.trim());
		}
		String firstElement = orderDetails.get(0);
		System.out.println(firstElement);
		
		WebElement summary= driver.findElement(By.xpath("//div[text()='"+firstElement+"']//button[text()='View summary']"));
		summary.click();
		
	}
	
	public void cancelled(String sname)
	{
		
		cancelled.click();
		String  orderdateandtime = driver.findElement(By.xpath("//div[text()='"+sname+"']/following-sibling::div")).getText();

		String[] parts = orderdateandtime.split("View");
		ArrayList<String> orderDetails = new ArrayList<>();
		for (String part : parts) {
		    orderDetails.add(part.trim());
		}
		String firstElement = orderDetails.get(0);
		System.out.println(firstElement);
		
		WebElement summary= driver.findElement(By.xpath("//div[text()='"+firstElement+"']//button[text()='View summary']"));
		summary.click();
		
	}
	
	
	
	
	
	
	
}
