package net.techcenture.automation.tests1;

import org.openqa.selenium.By;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import net.techcenture.core.InitDriver;

public class Registration extends InitDriver {

	@Parameters({"firstname", "lastname", "userid" })
	@Test
	public void RegisterrAuser(@Optional("John") String fname, @Optional("Smith") String lname, @Optional("j.smith") String userId) {
		driver.get("http://www.automationpractice.com/");
		//open registration form
		//enter first name
//		driver.findElement(By.id("")).sendKeys(fname);
		System.out.println("Entered firstname: " + fname);
		
		//enter last name
		System.out.println("Entered lastname: " + lname);

		//enter user id
		System.out.println("Entered userid: " + userId);

		//enter password
		//click register
		//
	}
	
	@Test
	public void RegistrationTest2() {
		driver.get("http://www.automationpractice.com/");
	}
	
	@Test
	public void RegistrationTest3() {
		driver.get("http://www.automationpractice.com/");
	}
}
