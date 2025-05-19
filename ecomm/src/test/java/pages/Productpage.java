package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Productpage {
	
	private WebDriver driver;

	// Constructor to initialize driver
	public Productpage(WebDriver driver) {
		this.driver = driver;
	}
	private By searchproduct = By.id("search_product");
	private By searchButton = By.id("submit_search");
	private By addtocart = By.xpath(
			"//div[@class='overlay-content']//a[@class='btn btn-default add-to-cart'][normalize-space()='Add to cart']");

	By searchedTextLocator = By.xpath("//h2[contains(text(),'Searched Products')]");
	By Added = By.xpath("//div[@class='modal-content']");
	
	private By viewcart = By.xpath("//u[normalize-space()='View Cart']");
	private By continuesShopping = By.xpath("//button[normalize-space()='Continue Shopping']");
	
	
	
	public void Addingtocart()  {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(searchproduct));
		driver.findElement(searchproduct).sendKeys("Blue top"); 
		driver.findElement(searchButton).click(); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(searchedTextLocator));
		Actions actions = new Actions(driver);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 500);");
		String productContainerXpath = "//div[@class='product-image-wrapper']";
		WebElement productContainer = driver.findElement(By.xpath(productContainerXpath));
		actions.moveToElement(productContainer).perform();
		
		driver.findElement(addtocart).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(Added));
		driver.findElement(viewcart).click();
		
		
	}
}
