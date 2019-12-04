package com.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.functionalLibrary.BaseClass;

public class FBHomePage extends BaseClass {
	
	public  FBHomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="email")
	private  WebElement userName;
	
	@FindBy(name="pass")
	private  WebElement passWord;
	
	@FindAll({
	@FindBy(name="login"),
	@FindBy(xpath="//input[@value='Log In']")})
	private WebElement logIn;

	public WebElement getUserName() {
		return userName;
	}

	public void setUserName(WebElement userName) {
		this.userName = userName;
	}

	public WebElement getPassWord() {
		return passWord;
	}

	public void setPassWord(WebElement passWord) {
		this.passWord = passWord;
	}

	public WebElement getLogIn() {
		return logIn;
	}

	public void setLogIn(WebElement logIn) {
		this.logIn = logIn;
	}
	
	
	
}
