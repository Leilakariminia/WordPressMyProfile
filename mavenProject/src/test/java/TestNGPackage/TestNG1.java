package TestNGPackage;

import org.testng.annotations.BeforeMethod;

public class TestNG1 {
 WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		driver= new ChromeDriver;
		
		
	}
	

}
