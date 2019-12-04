package com.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.functionalLibrary.BaseClass;
import com.objectRepository.FBHomePage;

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

