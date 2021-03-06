package wordpressMyProfile;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyProfileTestCase2 {
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
		// Negative test case
		password.sendKeys("Leila/12345");

		WebElement loginButton = driver.findElement(By.xpath("//button[@class='button form-button is-primary']"));
		loginButton.click();
		WebElement message = driver.findElement(By.xpath("(//*[name()='svg']//parent::span)[3]"));
		String actual1 = message.getText();

		if (actual1.equalsIgnoreCase("Oops, that's not the right password. Please try again!")) {
			System.out.println("Test 3 passed");
			
		}
	}
}
