package InterviewQuestions;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ScreenShotUsingRobotClass {

	public static void main(String[] args) throws AWTException, IOException {
		
		ChromeOptions chm = new ChromeOptions();
		chm.addArguments("--start-maximized");
		
		WebDriver driver = new ChromeDriver(chm);
		driver.get("https://www.google.com/");
		
		
		Robot r = new Robot();
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		
		Rectangle rec = new Rectangle(dim);
		
		BufferedImage source = r.createScreenCapture(rec);
		
		File dest = new File("C:\\Users\\Parthi Rajan\\Parthi Rajan\\DataDrivenUsingTestNg\\src\\test\\resources\\Screenshot\\1");
		
		ImageIO.write(source,"jpg",dest);
		
		
		
	}
}
