package Testcasesorder.pageobjects;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Orderflow.Absractcomponents.Abstractdata;

public class Landingpage extends Abstractdata {

	WebDriver driver;
	
	public  Landingpage(WebDriver driver)
	{
		super(driver);
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	WebElement useremail;
	
	@FindBy(id="password")
	WebElement passwordel;
	
	@FindBy(xpath="//button[@button_text='Login']")
	WebElement loginbutton;

	public void loginapp(String email,String password)
	{
		
		useremail.sendKeys(email);
		passwordel.sendKeys(password);
		loginbutton.click();
		
	}
	
	public void loginurl()
	{
		driver.get("https://buyer-app-preprod-v2.ondc.org/login");
	}
	
	 
	 @FindBy(xpath="//p[text()='Cart']")
		WebElement addToCartButton;
	 
	
	public void cartbutton()
	{
		addToCartButton.click();
	}
	
	
	
	
	
	
}
