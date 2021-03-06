package wordpressMyProfile;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyProfileTestCase1 {
	WebDriver driver;

	@Test
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://wordpress.com/log-in?redirect_to=%2Fme");
		WebElement login = driver.findElement(By.xpath("//input[@id='usernameOrEmail']"));
		login.sendKeys("leilakariminia@gmail.com");
		
		
		WebElement continueButton = driver.findElement(By.xpath("//button[@class='button form-button is-primary']"));
		continueButton.click();
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("Leila/1234");
		WebElement loginButton = driver.findElement(By.xpath("//button[@class='button form-button is-primary']"));
		loginButton.click();
		String Actual = driver.getTitle();
		String Expected = "Log In — WordPress.com";
		Assert.assertEquals(Actual, Expected);
		System.out.print("test1 passed");
		WebElement firstName = driver.findElement(By.xpath("//input[@id='first_name']"));
		firstName.clear();
		firstName.sendKeys("Leila");

		WebElement lastName = driver.findElement(By.xpath("//input[@id='last_name']"));
		lastName.clear();
		lastName.sendKeys("Karimi");
		WebElement hideButton = driver.findElement(By.xpath("//input[@id='inspector-toggle-control-0']"));
		hideButton.click();
		
		WebElement saveProfile = driver.findElement(By.xpath("//button[@class='button form-button is-primary']"));
		saveProfile.click();
				
		WebElement message = driver.findElement(By.xpath("//span[@class='notice__text']"));
	      String actual1 = message.getText();

if(actual1.equalsIgnoreCase("Settings saved successfully!")) {
	System.out.print("\ntest2 passed\n");
	driver.close();
	}






}}
