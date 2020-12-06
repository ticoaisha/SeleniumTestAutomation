package demo.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import net.techcenture.core.InitDriver;

public class Annotations3 extends InitDriver{

	
	/*BeforeClass -> means before any class
	 * 
	 * 1. BeforeClass
	 * 2. Do all the Tests
	 * 3. AfterClass
	 * 
	 * BeforeSuite -> means before everything
	 * 
	 * 
	 * 
	 */
	
	
			
	@Test
	public void testOne() {
		System.err.println("This is test one");
	}
	
	@Test
	public void testTwo() {
		System.err.println("This is test two");
	}
	
	@Test
	public void testThree() {
		System.err.println("This is test three");
	}
	
	
}
