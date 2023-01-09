package XYZ;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XYZagain {

	public static void main(String[] args) {
		WebDriver driver ; 
		  
		  WebDriverManager.chromedriver().setup();

		  driver = new ChromeDriver();

		  driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");

	}

}
