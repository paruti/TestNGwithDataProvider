package com.waits.concept;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpWaits {
	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Parthi Rajan\\Parthi Rajan\\DataDrivenUsingTestNg\\src\\test\\resources\\resources\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		WebDriverWait wait = new WebDriverWait(driver,30);

		Actions ac = new Actions(driver);
		
		WebElement mouseover = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='COURSES']")));
		ac.moveToElement(mouseover).perform();
		
	WebElement sapM = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Software Testing Training ']")));
		ac.moveToElement(sapM).perform();
		
		driver.findElement(By.xpath("//span[text()='Manual Testing Training']")).click();
		
/*	WebElement element =driver.findElement(By.xpath("//body/div/div/div[2]/ul/li[3]/ul/li[9]/ul/li/a/span[1]"));
	element.click();
*/	
		/*List<WebElement> elements = driver.findElements(By.tagName("a"));
		for (WebElement links:elements) {
			String text = links.getText();
			String atr = links.getAttribute("href");
			System.out.println(text+" "+atr);
			
			
		}*/
	}



}
