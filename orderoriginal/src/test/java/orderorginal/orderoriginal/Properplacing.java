package orderorginal.orderoriginal;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.internal.util.Assert;

public class Properplacing {

	
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		String email = "abhis1406@gmail.com";
		String password = "Abhi@1998";
		String sname = "DS super market hsr layout Customization";
		String caname = "Beverage";
		
		

		driver.get("https://buyer-app-preprod-v2.ondc.org/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[@button_text='Login']")).click();

		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.MuiBox-root.css-ayc40e\r\n")));
		WebElement element = driver.findElement(By.xpath("//*[text()='560102']"));
		element.click();
		//Thread.sleep(2000);
		List<WebElement> category = driver.findElements(
				By.xpath("//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 MuiGrid-grid-sm-12 MuiGrid-grid-md-12 MuiGrid-grid-lg-12 MuiGrid-grid-xl-12 css-15j76c0']//h5"));
		
		for (WebElement fullcat : category) {
			System.out.println(fullcat.getText().trim());
			Thread.sleep(3000);
			String abhi=fullcat.getText().trim();
			if(abhi.contains(caname))
			{
				WebElement element1 = driver.findElement(By.xpath("//*[text()='"+caname+"']"));
				element1.click();
				break;
			}
				
		}
		
			
				
			//driver.findElement("//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 MuiGrid-grid-sm-12 MuiGrid-grid-md-12 MuiGrid-grid-lg-12 MuiGrid-grid-xl-12 css-15j76c0']//h5[text()='"+caname+"'])
		       
		
	//	WebElement element1 = driver.findElement(By.xpath("//*[text()='Food & ']"));
	//	element1.click();
		//Thread.sleep(3000);
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		
		
		//WebElement element = driver.findElement(By.xpath("//div[@class='jss239']//div[@class='MuiTypography-root MuiTypography-body jss242 css-1ti4s1m' and contains(text(), '"+sname+"')]"));
		//actions.moveToElement(element).perform();
		element.click();
		By elementLocator = By
				.xpath("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-spacing-xs-3 jss109 css-1h77wgb']");
		By elementLocator1 = By.xpath("//div[text()='DS super market hsr layout Customization']");

		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(elementLocator)).perform();
		//Thread.sleep(3000);
		List<WebElement> stores = driver.findElements(
				By.xpath("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-spacing-xs-3 css-1h77wgb']"));
		for (WebElement storeName : stores) {
			System.out.println(storeName.getText());

	}

		actions.moveToElement(driver.findElement(elementLocator1)).perform();
		driver.findElement(elementLocator1).click();
		By elementLocator2 = By.xpath("//button[text()='Menu']");
		actions.moveToElement(driver.findElement(elementLocator2)).perform();
		driver.findElement(elementLocator2).click();
		//Thread.sleep(2000);
		List<WebElement> itemcategory = driver.findElements(
				By.xpath("//div[@class='MuiBox-root css-1o7pqxs']"));
		
		for (WebElement itemcategoryname : itemcategory) {
			System.out.println(itemcategoryname.getText());

	}
		driver.findElement(By.xpath("//div[text()='Biryani and others (custom)']")).click();

		//Thread.sleep(2000);
		List<WebElement> items = driver.findElements(
				By.xpath("//div[@class='MuiBox-root css-1o7pqxs']"));
		
		for (WebElement itemnames : items) {
			System.out.println(itemnames.getText());

	}
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='Fish Fry']")).click();
		
		//Thread.sleep(3000);
		By elementLocator3 = By.xpath("//div[@class='jss225']");
		//div[@class='MuiGrid-root MuiGrid-container css-exu8ry']
		
		actions.moveToElement(driver.findElement(elementLocator3)).perform();
		
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		
		for(int i=1;i<5;i++) {
			
			
		driver.findElement(By.xpath("//button[text()='+']")).click();	
		
			
		}
		
		//Thread.sleep(2000);
	System.out.println(driver.findElement(By.xpath("//button[contains(@class, 'MuiButton-root') and contains(@class, 'css-5tqugd')]")).getText());
	
	By elementLocator4 = By.xpath("//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-7 jss235 css-7vy65v']");
	actions.moveToElement(driver.findElement(elementLocator4)).perform();
	//Thread.sleep(2000);
	List<WebElement> product = driver.findElements(
			By.xpath("//div[@class='MuiGrid-root MuiGrid-container jss234 css-1d3bbye']"));
	
	for (WebElement productdetails : product) {
		System.out.println(productdetails.getText());

}
	driver.findElement(By.xpath("//div[@class='jss15']")).click();
	
	
	
		
		
		
		
		
		
		
		
			
		
	}
}
