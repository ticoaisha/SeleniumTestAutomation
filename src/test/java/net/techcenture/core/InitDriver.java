package net.techcenture.core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InitDriver {

	protected WebDriver driver;
	
	@Parameters({"browserType"})
	@BeforeMethod
	public void invoke_browser(@Optional("chrome") String browserType) {
		
		if(browserType.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup(); 
			driver = new ChromeDriver();
			
		}else if(browserType.equalsIgnoreCase("ie")) {
			WebDriverManager.iedriver().setup(); 
			driver = new InternetExplorerDriver();
			}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		}
	
	@AfterMethod
	public void close_browser() {
		driver.close();
	}
	
}
