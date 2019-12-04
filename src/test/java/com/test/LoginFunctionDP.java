package com.test;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.functionalLibrary.BaseClass;
import com.objectRepository.FBHomePage;

	
public class LoginFunctionDP extends BaseClass{
	
	String[][] data= {
			{"parthiraj93@gmail.com","rajangetfit123"},
			{"parthiraj","rajangetfit123"},
			{"parthiraj93@gmail.com","parthi"},
			{"parthi","rajan"}
			};
	
	@DataProvider(name="loginData")
	public String[][] loginDataprovider() {
		return data;
	}
	
	
	
	
	
	@BeforeMethod
	public void bfTIme() {
		launch("https://www.facebook.com/");
		driver.manage().deleteAllCookies();
	
		Date d = new Date();
		int month = d.getMonth();
		int year = d.getYear();
		int date = d.getDate();
		int hours = d.getHours();
		int minutes = d.getMinutes();
		int seconds = d.getSeconds();
		System.out.println("bfTime "+date+"_"+month+"_"+year+"_"+hours+"_"+minutes+"_"+seconds);
	}
	
	@AfterMethod
	public void afTime() {
		Date d = new Date();
		int month = d.getMonth();
		int year = d.getYear();
		int date = d.getDate();
		int hours = d.getHours();
		int minutes = d.getMinutes();
		int seconds = d.getSeconds();
		System.out.println("afTime "+date+"_"+month+"_"+year+"_"+hours+"_"+minutes+"_"+seconds);
		driver.quit();

	}
	
	@Test(dataProvider="loginData")
	public static void fbLogin(String uname,String pswd) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		FBHomePage fb = new FBHomePage();
		enterText(fb.getUserName(), uname);
		enterText(fb.getPassWord(), pswd);
		clkBtn(fb.getLogIn());
	}
	

	
	
}
