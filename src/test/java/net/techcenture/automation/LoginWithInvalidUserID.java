package net.techcenture.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginWithInvalidUserID {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		driver.get("http://www.automationpractice.com/");
		
		WebElement signInElement = driver.findElement(By.className("login"));
		signInElement.click();
		
		WebElement emailAddressBoxElement = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		emailAddressBoxElement.sendKeys("myunknowxaad@mailinator.com");

		WebElement signInBoxElement = driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span"));
		signInBoxElement.click();
		
		WebElement errorMessagElementOneElement = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/p"));
		String errorString1 = errorMessagElementOneElement.getText();
		System.out.println(errorString1);
		
		WebElement errorMessagElementTwoElement = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li"));
		String errorString2 = errorMessagElementTwoElement.getText();
		System.out.println(errorString2);
		
	}

}
