package wordpressMyProfile;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MyProfileTestCase3 {

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
	
		WebElement upload = driver.findElement(By.xpath("//div[@class='masterbar__notifications']"));
		Actions builder = new Actions(driver);
	    builder.moveToElement(upload).click().perform();
	   List < WebElement> list = driver.findElements(By.xpath("//div[@class='wpnc__filter']/ul/li"));
	    System.out.println(list.size());
	    for(int i=0;i<list.size();i++) {
	    	System.out.println(list.get(i).getText());
	    	
	    }

	    	 
	     }
}
