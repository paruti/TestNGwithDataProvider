package com.functionalLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	 public static WebDriver driver;
	 

	public static  void launch(String uRL) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Parthi Rajan\\Parthi Rajan\\DataDrivenUsingTestNg\\src\\test\\resources\\resources\\Driver\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get(uRL);
	}
	
	public static void clkBtn(WebElement element) {
		element.click();
	}
	
	public static void enterText(WebElement element ,String text) {
		element.sendKeys(text);
	}
	
	public static void dropDown(WebElement dDown,String text) {
		Select s = new Select(dDown);
		s.selectByVisibleText(text);
	}
	
}
