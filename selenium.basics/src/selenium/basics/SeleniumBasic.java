package selenium.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasic {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers.chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("http://tek-school.com/retail/");

	}

}
