package com.failedTestCase.Rerun;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.functionalLibrary.BaseClass;

public class RetryAnnTestCases extends BaseClass {
	
	@BeforeMethod
	public void launch() {
		launch("https://www.google.com/");

	}
	
	@AfterMethod
	public void close() {
driver.close();
	}
	@Test
	public void failedTest() {
		driver.findElement(By.name("z")).sendKeys("parthi");
	}
	
	@Test
	public void faileeTest1() {
		driver.findElement(By.name("y")).sendKeys("rajan");
	}

}
