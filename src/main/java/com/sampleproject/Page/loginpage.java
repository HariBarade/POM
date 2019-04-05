package com.sampleproject.Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sampleproject.Base.Testmain;

public class loginpage extends Testmain {

	
	@FindBy(name= "username")
	 WebElement username;
	
	
	@FindBy(name ="password")
	WebElement password;
	
	
	@FindBy(xpath = ".//input[@type='submit']")
	WebElement Loginbutton;
	
	
	public loginpage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public String validateloginofFreeCRM() {
		return driver.getTitle();
	}
	
	public homepage loginwithexistinguser (String USERNAME , String PASWORD) {
		username.sendKeys(USERNAME);
		password.sendKeys(PASWORD);
		Loginbutton.click();
		
		return new homepage();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
