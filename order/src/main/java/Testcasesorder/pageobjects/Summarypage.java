package Testcasesorder.pageobjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Orderflow.Absractcomponents.Abstractdata;

public class Summarypage extends Abstractdata {

	WebDriver driver;

	public Summarypage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = ".jss17")
	WebElement profile;

	@FindBy(xpath = "//li[text()='My Profile']")
	WebElement myprofile;

	@FindBy(xpath = "//li[text()='Order History']")
	WebElement orderhistory;
	@FindBy(xpath = "//li[text()='Complaints]")
	WebElement complaints;

	@FindBy(xpath = "//li[text()='Support]")
	WebElement support;
	@FindBy(xpath = "//li[text()='Test your catalogue]")
	WebElement testyourcatalogue;
	@FindBy(xpath = "//li[text()='Logout]")
	WebElement logout;
	
	public void profilclick() {

		profile.click();
	}
	
	
	public void myprofile() {

		myprofile.click();
	}
	
	public void orderhistory() {

		orderhistory.click();
	}
	
	public void complaints() {

		complaints.click();
	}
	
	public void support() {

		support.click();
	}
	
	public void Testyourcatalogue() {

		testyourcatalogue.click();
	}
	
	public void logout() {

		logout.click();
	}

}
