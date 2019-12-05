package com.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.functionalLibrary.BaseClass;

public class PassportIndia extends BaseClass {
	
	public PassportIndia() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//select[@name='dcdrLocation']")
	private WebElement dropDown;

	public WebElement getDropDown() {
		return dropDown;
	}

	public void setDropDown(WebElement dropDown) {
		this.dropDown = dropDown;
	}
	
	
	
}
