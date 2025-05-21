package Orderflow.Absractcomponents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Abstractdata {

	WebDriver driver;
	
	
	
	public Abstractdata(WebDriver driver) {
		this.driver=driver;
	}

	public void waitforelementtovisible(By findby)
	{
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(findby));
		
	
	}
	public void waitforpresenceOfElementLocated(By findby)
	{
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait1.until(ExpectedConditions.presenceOfElementLocated(findby));
		
	
	}
	
	
	
	
	
	
	
	
}
