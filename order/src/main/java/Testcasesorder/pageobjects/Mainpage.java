package Testcasesorder.pageobjects;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Orderflow.Absractcomponents.Abstractdata;

public class Mainpage extends Abstractdata {

	WebDriver driver;

	public Mainpage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	By categoryby = By.xpath("//div[@class='MuiBox-root css-ayc40e']");

	@FindBy(xpath = "//label[@class='MuiFormControlLabel-root MuiFormControlLabel-labelPlacementEnd jss87 css-1jaw3da']//p[text()='560102']")
	WebElement Pincodebutton;
	
	public void pincode() {
		waitforelementtovisible(categoryby);
		Pincodebutton.click();

	}
	
	@FindBy(xpath = "//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 MuiGrid-grid-sm-12 MuiGrid-grid-md-12 MuiGrid-grid-lg-12 MuiGrid-grid-xl-12 css-15j76c0']//h5")
	List<WebElement> categorylist;

	public List<WebElement> bcategory(String caname) {
		for (WebElement fullcat : categorylist) {
			//System.out.println(fullcat.getText().trim());
			String abhi=fullcat.getText().trim();
			if(abhi.contains(caname))
			{
				WebElement element1 = driver.findElement(By.xpath("//*[text()='"+caname+"']"));
				element1.click();
				break;
			}

	}
		return categorylist;

	
	}
	
	
	
	
}
