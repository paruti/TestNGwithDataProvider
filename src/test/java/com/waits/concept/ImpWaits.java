package com.waits.concept;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImpWaits {
	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Parthi Rajan\\Parthi Rajan\\DataDrivenUsingTestNg\\src\\test\\resources\\resources\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//span[text()='Hello. Sign in']")).click();
		driver.findElement(By.name("email")).sendKeys("+919176121746");
		driver.findElement(By.id("continue")).click();

	}

}
