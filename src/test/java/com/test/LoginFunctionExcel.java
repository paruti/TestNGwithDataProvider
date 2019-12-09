package com.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

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
import com.objectRepository.FBHomePage1;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class LoginFunctionExcel extends BaseClass{
	

	String[][] data= null;


	
	
	
	@DataProvider(name="loginData")
	public String[][] loginDataprovider() throws BiffException, IOException {
		data =getExcelData();
		return data;
	}
	
	public String[][] getExcelData() throws BiffException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\Parthi Rajan\\Desktop\\Book1.xls");
		Workbook workbook = Workbook.getWorkbook(file);
		Sheet sheet = workbook.getSheet(0);
		int rowcount = sheet.getRows();
		int columncount = sheet.getColumns();
		String testData[][] = new String[rowcount-1][columncount];
		for (int i = 1; i <rowcount ; i++) {
			for (int j = 0; j < columncount; j++) {
				testData[i-1][j] = sheet.getCell(j,i).getContents();
			}
			
		}
	return testData;	
		
	}
	
	
	
	
	
	@BeforeMethod
	public void bfTIme() {

		launch("https://www.facebook.com/");
	driver.manage().deleteAllCookies();
	}
	
	@AfterMethod
	public void afTime() {
		driver.close();

	}
	
	@Test(dataProvider="loginData")
	public static void fbLogin(String uname,String pswd) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		FBHomePage1 fb1 = new FBHomePage1();
		enterText(fb1.getUserName(), uname);
		enterText(fb1.getPassWord(), pswd);
		clkBtn(fb1.getLogIn());
	}
	
	

	
	
}

