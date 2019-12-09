package com.test;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.functionalLibrary.BaseClass;
import com.objectRepository.FBHomePage;

public class LoginFunctionDP extends BaseClass {

	String[][] data = { { "parthiraj93@gmail.com", "rajangetfit123" },
			{ "parthiraj", "rajangetfit123" },
			{ "parthiraj93@gmail.com", "parthi" }, 
			{ "parthi", "rajan" } };

	@DataProvider(name = "loginData")
	public String[][] loginDataprovider() {
		return data;
	}

	@BeforeTest
	@Parameters("Browser")
	public static void browser(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {

			driver = new ChromeDriver();
		}
		 else if (browserName.equalsIgnoreCase("ie")) {

			driver = new InternetExplorerDriver();
		}
		

	}

	@BeforeMethod
	public void bfTIme() {
		driver.get("https://www.facebook.com/");
		driver.manage().deleteAllCookies();

	}

	@AfterMethod
	public void afTime() {
		driver.close();

	}

	@Test(dataProvider = "loginData")
	public static void fbLogin(String uname, String pswd) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		FBHomePage fb = new FBHomePage();
		enterText(fb.getUserName(), uname);
		enterText(fb.getPassWord(), pswd);
		clkBtn(fb.getLogIn());
	}
	
	@AfterTest
	public static void afterTest() {
System.out.println("DataProvider");
driver.quit();
}

}
