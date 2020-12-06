package demo.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import net.techcenture.core.InitDriver;

public class Annotations2 extends InitDriver {

	
	/*BeforeClass -> means before any class
	 * 
	 * 1. BeforeClass
	 * 2. Do all the Tests
	 * 3. AfterClass
	 * 
	 * BeforeSuite -> means before everything
	 * 
	 * BeforeSuite
	 * Tests
	 * AfetrSuite
	 * 
	 * Before Method
	 * Then Test
	 * 
	 * Before Method
	 * Then another Test
	 * and so on
	 * 
	 * BeforeMethod - before each Test Method
	 * 
	 */
	
	//we created InitDriver class to keep BeforeSuite / AfterSuite methods there
	//no need to keep them here
	
//	@BeforeSuite
//	public void invoke_browser() {
//		System.out.println("Browser opened");
//	}
//	
//	@AfterSuite 
//	public void close_browser() {
//		System.out.println("Browser closed");
//	}
	
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
	
	@Test
	public void testFour() {
		System.err.println("This is test four");
	}
	
}
