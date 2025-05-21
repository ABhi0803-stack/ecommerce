package Testcasesorder.pageobjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Orderflow.Absractcomponents.Abstractdata;


public class Itemqty extends Abstractdata {

	WebDriver driver;

	public Itemqty(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@class='MuiInputBase-input css-db9kuc']")
	WebElement searchfield;

	@FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 jss443 css-a9xqrf']")
	List<WebElement> Storelistfromsearch;

	public void searchforitem(String itemname) {
		searchfield.sendKeys(itemname + Keys.ENTER);

	}

	public List<WebElement> storefromsearchsel(String sname) {
		for (WebElement fullstorel : Storelistfromsearch) {
			// System.out.println(fullcat.getText().trim());
			String st = fullstorel.getText().trim();
			if (st.contains(sname)) {
				WebElement ele1 = driver.findElement(By.xpath("//p[text()='" + sname + "']"));
				ele1.click();
				break;
			}

		}
		return Storelistfromsearch;

	}

	public void additionofitem() throws InterruptedException {
		Landingpage landingpage = new Landingpage(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement addToCartButton = driver.findElement(By.xpath("//button[text()='Add to cart']"));
		try {
			wait.until(ExpectedConditions.visibilityOf(addToCartButton));
			addToCartButton.click();
		} catch (Exception e) {
			e.printStackTrace();
		}

		WebElement valueField = driver.findElement(
				By.xpath("//button[contains(@class, 'MuiButton-root') and contains(@class, 'css-5tqugd')]"));
		WebElement increaseButton = driver.findElement(By.xpath("//button[text()='+']"));
		WebElement decreaseButton = driver.findElement(By.xpath("//button[text()='-']"));
		int target = 5;

		try {
			String valueText = valueField.getText();
			int value = Integer.parseInt(valueText.trim());

			if (value == target) {
				landingpage.cartbutton();
			} else if (value < target) {
				while (value < target) {
					increaseButton.click();
					value++;
					Thread.sleep(2000);
				}
				landingpage.cartbutton();
			} else if (value > target) {
				while (value > target) {
					decreaseButton.click();
					value--;
					Thread.sleep(2000);
				}
				landingpage.cartbutton();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
