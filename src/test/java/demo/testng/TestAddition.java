package demo.testng;

import java.awt.Checkbox;
import java.util.concurrent.TimeUnit;

import org.hamcrest.core.Is;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestAddition {

	public static void main(String[] args) {

		
		launching_website();
		
	}
	
public static void launching_website() {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
	driver.get("http://automationpractice.com/");
	
	WebElement element = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/span/strong"));
	String phoneNumber = element.getText();
	
	if(phoneNumber.equals("0123-456-789")) {
		System.out.println("Launching website passed");
	}else {
		System.out.println("Launching website failed");

	}
	
}

/*
 * we annotated this test for TestNG so TestNG knows that this is a test
 * 
 */
@Test
public static void subtraction() {
	int x=5;
	int y=3;
	int z=0;
	
	z=x-y;
	
	Assert.assertEquals(z,0,"Verify 5 - 3 is equals to 2");//z -> actual result 2 -> expected result
}

}
	