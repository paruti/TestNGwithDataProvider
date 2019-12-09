package InterviewQuestions;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateElementUsingRelativeXpath {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Dimension dim = new Dimension(1366, 768);
		driver.manage().window().setSize(dim);
		
		driver.findElement(By.name("q")).sendKeys("vikings");
		List<WebElement> search = driver.findElements(By.xpath("//ul[@role='listbox']//following::li/b"));
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		for(WebElement last:search) {
			String text = last.getText();
			System.out.println(text);
			if (text.equalsIgnoreCase(" season 6 release date in india")) {
				last.click();
				break;
			}
		}
	
	}
}
