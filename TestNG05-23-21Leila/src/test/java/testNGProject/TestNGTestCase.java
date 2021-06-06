package testNGProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGTestCase {

	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		System.setProperty("Webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.freecrm.com");
	}		
		
		@Test 
	public void verifyPageTitleTest() {
		String title = driver.getTitle();
		System.out.println("The page title is : " + title);
		Assert.assertEquals(title, "#1 Free CRM customer relationship management software cloud");
			}
	
	@Test
	public void verifyFreeCRMLogoTest() {
		boolean flag=driver.findElement(By.xpath("//*[local-name() = 'svg']")).isDisplayed();
		Assert.assertTrue(flag);
	}
	
}
					
//		@AfterMethod
//		public void tearDown() {
//			driver.quit();
//		}
//		}
		
		
		

