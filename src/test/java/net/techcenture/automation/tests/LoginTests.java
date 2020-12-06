package net.techcenture.automation.tests;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.filefilter.TrueFileFilter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.techcenture.core.InitDriver;

public class LoginTests extends InitDriver{

	
	/*
	 * @Test(enabled = false) -> will not run "The Test that have this annotation"
	 * 
	 * 
	 * Assertion - -> makes Test pass or fail
	 * 
	 * Execution itself (w/o any assertion) - -> will result "pass"
	 * For example, if you will comment Assertion statement -> test will pass
	 * 
	 * TestNG will run those tests that are annotated @Test
	 * 
	 */
	
	
	@Test
	public void login_with_valid_userid_but_invalid_password() {
		
		
//		Go to http://www.automationpractice.com
//			Click Sign in button from top right corner of the page
//			Enter valid email address 'abc213@mailinator.com' in email address text field of right side
//			Enter invalid password 'myinvalidpwd' in password text field
//			Click 'Sign in' button
//			Verify error message displayed 'There is 1 error'
//			Verify error message displayed 'Authentication failed.'


				
		//Go to http://www.automationpractice.com
		driver.get("http://www.automationpractice.com/");

		//Click Sign in button from top right corner of the page
		WebElement signInButtonElement = driver.findElement(By.xpath("//a[@class='login']"));
		signInButtonElement.click();
		
		
//		Enter valid email address 'abc213@mailinator.com' in email address text field of right side

		driver.findElement(By.xpath("//input[@name='email' and @id='email']")).sendKeys("abc213@mailinator.com");
		
//		Enter invalid password 'myinvalidpwd' in password text field

		driver.findElement(By.xpath("//input[@id='passwd' and @name='passwd' and @data-validate='isPasswd']")).sendKeys("myinvalidpwd");

	}
	
	
	@Test
	public void login_with_invalid_userid() {
		/*
		 * Webdriver manager -> will automatically understand which OS you are using, 
		 * which version of the chrome browser you are using, donwloading it for our project
		 * 
		 * 
		 */
		WebDriverManager.chromedriver().setup(); //download appropriate chromedriver for chromebrowser
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//Go to http://www.automationpractice.com
		driver.get("http://www.automationpractice.com/");

		//Click Sign in button from top right corner of the page
		WebElement sign_in_button = driver.findElement(By.className("login"));
		sign_in_button.click();
		
		//Enter invalid email address 'myunknowxaad@mailinator.com' in email address text field of right side
		WebElement email_address_textfield = driver.findElement(By.id("email"));
		email_address_textfield.sendKeys("myunknowxaad@mailinator.com");
		
		//Click Sign in button
		sign_in_button = driver.findElement(By.id("SubmitLogin"));// I already have this variable (sign_in_button) in the top so do not need to decalre it again
		sign_in_button.click();
		
		//Verify error message displayed 'There is 1 error'
		WebElement err_msg1_holder = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/p"));
		String errMsg1 = err_msg1_holder.getText();
		Assert.assertEquals(errMsg1, "There is 1 error", "Verify a text displayed for error as [There is 1 error]");
	
		//Verify error message displayed 'Password is required.'
		WebElement err_msg2_holder = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li"));
		String errMsg2 = err_msg2_holder.getText();
		Assert.assertEquals(errMsg2, "Password is required.", "Verify a text displayed for error as [Password is required]");
		
	}
	
	@Test(enabled = true, priority = 1)
	public void login_2_test() {
		
	}
	
	@Test
	public void login_3_test() {
		
		boolean result = false;
		Assert.assertEquals(result, false);
		
	}
	
	@Test(priority = 0)
	public void login_4_test() {
		
		//with this test we just want to verify that the "Search Box" is displayed
		WebDriverManager.chromedriver().setup(); 
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("http://www.automationpractice.com/");
		WebElement search_text_box = driver.findElement(By.id("search_query_top"));
		boolean is_srch_txt_box_displayed = search_text_box.isDisplayed();
		
		Assert.assertEquals(is_srch_txt_box_displayed, true, "Check search text box displayed");		
		
	}
	
}
