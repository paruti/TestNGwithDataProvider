package InterviewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserWithoutSystemSetProperty {

	public static void main(String[] args) {
		
		ChromeOptions chm = new ChromeOptions();
		chm.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(chm);
		
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("games"+Keys.RETURN);
		driver.findElement(By.xpath("//span[contains(text(),'Games - Android Apps ')]")).click();
		driver.close();
		driver.quit();
	}
	
	
	
}

