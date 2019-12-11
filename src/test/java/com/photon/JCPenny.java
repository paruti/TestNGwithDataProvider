package com.photon;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JCPenny {
	public static void main(String[] args) {
		
		ChromeOptions chm = new ChromeOptions();
		chm.addArguments("--start-maximized");
		
	WebDriver driver = new ChromeDriver(chm);
		driver.get("https://www.jcpenney.com/");
		
		WebElement Shop1 = driver.findElement(By.xpath("//span[text()='Shop Departments']"));
				Actions a = new Actions(driver);
				a.moveToElement(Shop1).perform();
		WebElement shoes = driver.findElement(By.xpath("//a[text()='Shoes']"));
				//Actions ac = new Actions(driver);
				a.moveToElement(shoes).perform();;
				
			WebElement boot = driver.findElement(By.xpath("(//a[text()='Boots'])[2]"));
			boot.click();
			
			List<WebElement> lists = driver.findElements(By.xpath("//a//h6"));
			for(WebElement shoe:lists) {
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				String text = shoe.getText();
			//	System.out.println(text);
				if (text.equalsIgnoreCase("IZOD Mens Leon Lace Up Boots")) {
					shoe.click();
					break;
				}
			}
			
			JavascriptExecutor js =  (JavascriptExecutor)driver;
			WebElement scroll = driver.findElement(By.xpath("//div[@aria-label='size range']"));
			js.executeScript("arguments[0].scrollIntoView(true)",scroll );
			
			// driver.findElement(By.xpath("//option[text()='regular']")).click();
			
	/*		List<WebElement> sizes = driver.findElements(By.xpath("//select[@name='size']//following::option[1]"));
			for(WebElement size:sizes) {
				String text = size.getText();}*/
			
			WebElement size = driver.findElement(By.xpath("//select[@name='size']"));
			 
			Select  s = new Select(size);
			
			s.selectByVisibleText("10");
			
			
			
			}
			
			}
			
				
			
	
