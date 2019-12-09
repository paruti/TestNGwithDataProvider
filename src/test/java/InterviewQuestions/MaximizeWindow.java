package InterviewQuestions;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MaximizeWindow {
	public static void main(String[] args) {
		
		
		/*ChromeOptions chm = new ChromeOptions();
		chm.addArguments("--start-maximized-");
		*/
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		//driver.manage().window().maximize();
		
		Dimension dim = new Dimension(1366,768);
		driver.manage().window().setSize(dim);
		
	
	}
}
