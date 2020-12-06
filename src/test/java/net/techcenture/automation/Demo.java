package net.techcenture.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		
		
		driver.get("http://www.google.com");
		
		driver.findElement(By.xpath("//*[@id=\"gb\"]/div[2]/div[3]/div[1]/div/div[1]/a")).click();
		
		
		
	}
	
	
	
}
