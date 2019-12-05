package com.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.xml.LaunchSuite;

import com.functionalLibrary.BaseClass;
import com.objectRepository.PassportIndia;

public class SelectDropDown extends BaseClass {

	@Test
	public static void dropDown() {
		System.setProperty("webdriver.ie.driver",
				"C:\\Users\\Parthi Rajan\\Parthi Rajan\\TestNG\\src\\test\\resources\\Driver\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.get("www.flipkart.com");
	/*	PassportIndia pI = new PassportIndia();
		launch("https://portal2.passportindia.gov.in/AppOnlineProject/user/RegistrationBaseAction?request_locale=en");
		WebElement dDown = driver.findElement(By.xpath("//select[@name='dcdrLocation']"));
		dDown.sendKeys("chennai");
	*/	
	}
}
