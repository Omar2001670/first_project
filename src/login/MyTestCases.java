package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyTestCases {
	
	WebDriver driver = new ChromeDriver();
	
	String TheURL = "https://automationteststore.com/";
	
	
	@BeforeTest
	public void MySetup() {
		
		driver.get(TheURL);
		
		driver.manage().window().maximize();
	}
	
	@Test
	public void SignUp() {
		
		driver.navigate().to("https://automationteststore.com/index.php?rt=account/create");
		
		// Elements
		
		WebElement firstnameInput =  driver.findElement(By.xpath("//input[@name=\"firstname\"]"));
		WebElement lastnameInput =  driver.findElement(By.id("AccountFrm_lastname"));
		WebElement emailInput =  driver.findElement(By.id("AccountFrm_email"));
		WebElement telephoneInput =  driver.findElement(By.id("AccountFrm_telephone"));
		WebElement faxInput =  driver.findElement(By.id("AccountFrm_fax"));
		WebElement companyInput =  driver.findElement(By.id("AccountFrm_company"));
		WebElement address1Input =  driver.findElement(By.id("AccountFrm_address_1"));
		WebElement address2Input =  driver.findElement(By.id("AccountFrm_address_2"));
		WebElement cityInput =  driver.findElement(By.id("AccountFrm_city"));
		
		// Data
		
		String firstname = "Ahmad";
		String lastname = "Mohammad";
		String email = firstname+lastname+"@gmail.com";
		String telephone = "298564791594";
		String fax = "5963719";
		String company = "ltuc";
		String address1 = "Amman";
		String address2 = "Irbid";
		String city = "Amman";
		
		// Actions
		
	    firstnameInput.sendKeys(firstname);
		lastnameInput.sendKeys(lastname);
	    emailInput.sendKeys(email);
	    telephoneInput.sendKeys(telephone);
	    faxInput.sendKeys(fax);
	    companyInput.sendKeys(company);
	    address1Input.sendKeys(address1);
	    address2Input.sendKeys(address2);
	    cityInput.sendKeys(city);
	}

}
