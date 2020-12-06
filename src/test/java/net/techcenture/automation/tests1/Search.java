package net.techcenture.automation.tests1;

import org.testng.annotations.Test;

import net.techcenture.core.InitDriver;

public class Search extends InitDriver{

	public Object[][] searchData(){
		Object[][] data = new Object[][] {
			{"M","Medium","Black",85},
			{"F","Small","Red",125},
			{"F","Extra Small","White",55}
			
			
			};
	return data;
	}
	
	
	
	@Test
	public void SearchTest1(String gender, String size, String color, Integer maxPrice) {
		driver.get("http://www.automationpractice.com/");
		System.out.println("Searching a producr with Gender: " + gender + ", Size: " + size + ", Color: " + color + ", MaxPrice: " + maxPrice);
	}
	
	@Test
	public void SearchTest2() {
		driver.get("http://www.automationpractice.com/");
	}
}
