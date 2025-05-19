package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Signuppage {
	private WebDriver driver;

	// Constructor to initialize driver
	public Signuppage(WebDriver driver) {
		this.driver = driver;
	}

	private By Male = By.id("id_gender1");
	private By Female = By.id("id_gender2");
	private By password = By.id("password");
	private By dayDropdown = By.id("days");
	private By monthDropdown = By.id("months");
	private By yearDropdown = By.id("years");
	private By firstname = By.id("first_name");
	private By lastname = By.id("last_name");
	private By company = By.id("company");
	private By address = By.id("address1");
	private By address2 = By.id("address2");
	private By countryDropdown = By.id("country");
	private By state = By.id("state");
	private By city = By.id("city");
	private By zipcode = By.id("zipcode");
	private By mobileno = By.id("mobile_number");
	private By createbutton = By.xpath("//button[@data-qa='create-account']");

	public void CreateAccount() {
		driver.findElement(Male).click();
		driver.findElement(password).sendKeys("Abhi@123");
		Select selectDay = new Select(driver.findElement(dayDropdown));
		selectDay.selectByVisibleText("8");

		Select selectMonth = new Select(driver.findElement(monthDropdown));
		selectMonth.selectByVisibleText("March");

		Select selectYear = new Select(driver.findElement(yearDropdown));
		selectYear.selectByVisibleText("1998");

		driver.findElement(firstname).sendKeys("Rangaraju");
		driver.findElement(lastname).sendKeys("R");
		driver.findElement(company).sendKeys("ABhi");
		driver.findElement(address).sendKeys("new bengaluru");
		driver.findElement(address2).sendKeys("new k");
		// Select selectcountry= new Select(driver.findElement(countryDropdown));
		// selectcountry.selectByVisibleText("India");

		driver.findElement(state).sendKeys("Karnataka");
		driver.findElement(city).sendKeys("Bengaluru");
		driver.findElement(zipcode).sendKeys("560057");
		driver.findElement(mobileno).sendKeys("6363088765");
		driver.findElement(createbutton).click();

	}
	By successMessage = By.xpath("//p[contains(text(),'Congratulations')]");
	private By continuebutton= By.xpath("//a[@data-qa='continue-button']");

	public void Accountcreated() {
		String expectedMessage = "Congratulations! Your new account has been successfully created!";
        String actualMessage = driver.findElement(successMessage).getText().trim();
        Assert.assertEquals(actualMessage, expectedMessage, "Account creation success message is not as expected!");
        driver.findElement(continuebutton).click(); 
	}

}
