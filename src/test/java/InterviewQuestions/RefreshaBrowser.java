package InterviewQuestions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RefreshaBrowser {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		ChromeOptions chm = new ChromeOptions();
		chm.addArguments("--start-maximized");
		
		WebDriver driver = new ChromeDriver(chm);
		//driver.navigate().refresh(); - if we are using driver.navigate().to("uRL")
		
		driver.get("https://www.google.com");
		
		Thread.sleep(4000);

		driver.get(driver.getCurrentUrl()); // refreshing by using getCurrentUrl method
		
		Thread.sleep(4000);
		
		Robot r = new Robot();	// refreshing by using Robot Class
		
		r.keyPress(KeyEvent.VK_F5);
		r.keyRelease(KeyEvent.VK_F5);
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mail"+Keys.RETURN);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		List<WebElement> down = driver.findElements(By.xpath("//h3"));
		for (WebElement scroll : down) {
			String text = scroll.getText();
			System.out.println(text);
			if (text.equals("Create a Gmail account - Gmail Help - Google Support")) {
				js.executeScript("arguments[0].scrollIntoView(true)", scroll);
				break;
			}
	}
		
	js.executeScript("location.reload()");	//using JavaScript Executor
	js.executeScript("history.go(0)");		//using JavaScript Executor
	}
}
