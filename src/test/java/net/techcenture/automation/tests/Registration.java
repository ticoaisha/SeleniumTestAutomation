package net.techcenture.automation.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import net.techcenture.core.InitDriver;

public class Registration extends InitDriver {

	@Test
	public void reg_test_1() {
		driver.findElement(By.id("cxcc")).click();
	}
	
	
}
