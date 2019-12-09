package com.photon;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JCPenny {
	public static void main(String[] args) {
		
	WebDriver driver = new ChromeDriver();
		driver.get("https://www.jcpenney.com/");
		
		WebElement Shop1 = driver.findElement(By.xpath("//span[text()='Shop Departments']"));
				Actions a = new Actions(driver);
				a.moveToElement(Shop1).perform();
		WebElement shoes = driver.findElement(By.xpath("//a[text()='Shoes']"));
				//Actions ac = new Actions(driver);
				a.moveToElement(shoes).perform();;
				
			WebElement boots = driver.findElement(By.xpath("(//a[text()='Boots'])[2]"));
			boots.click();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			List<WebElement> frames = driver.findElements(By.xpath("//iframe"));
			int size = frames.size();
			System.out.println(size);
				

	}
}